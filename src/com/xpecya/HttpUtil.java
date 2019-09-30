package com.xpecya;

import com.alibaba.fastjson.JSON;
import com.xpecya.requestStruct.BasicRequest;
import com.xpecya.responseStruct.BasicData;
import com.xpecya.responseStruct.BasicResponse;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import java.util.function.Consumer;

class HttpUtil {

    private static final String URL = "http://api.waditu.com";
    private static final String METHOD = "POST";

    private HttpUtil() {}

    static <T> void sendRequest(BasicRequest request,
                                       Class<T> responseClass,
                                       Consumer<Collection<T>> responseHandler) {
        try {
            URL url = new URL(URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(METHOD);
            connection.setConnectTimeout(15000);
            connection.setReadTimeout(60000);
            connection.setDoOutput(true);
            connection.setDoInput(true);

            OutputStream outputStream = connection.getOutputStream();
            String json = JSON.toJSONString(request);
            outputStream.write(json.getBytes());
            outputStream.flush();

            if (connection.getResponseCode() == 200) {
                InputStream inputStream = connection.getInputStream();
                InputStreamReader reader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(reader);
                String line = bufferedReader.readLine();
                BasicResponse responseObject = JSON.parseObject(line, BasicResponse.class);

                Integer code = responseObject.getCode();
                if (code == 0) {
                    BasicData basicData = responseObject.getData();

                    Collection<T> data = basicData.getInstances(responseClass);
                    responseHandler.accept(data);
                } else {
                    String msg = responseObject.getMsg();
                    System.err.println("请求失败！ error message: " + msg);
                }
                bufferedReader.close();
                reader.close();
                inputStream.close();
            } else {
                InputStream errorStream = connection.getErrorStream();
                InputStreamReader reader = new InputStreamReader(errorStream);
                BufferedReader bufferedReader = new BufferedReader(reader);
                String line = bufferedReader.readLine();
                System.err.println(line);
                bufferedReader.close();
                reader.close();
                errorStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
