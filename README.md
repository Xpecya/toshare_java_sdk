<h1>toshare java sdk</h1>
<br />
<p>基于toshare的http接口进行了浅层的封装</p>
<p>对toshare的每个接口实现了获取函数返回值的调用，和在回调函数中处理两种api</p>
<p>部分接口由于尚未开放api调用权限，因此本sdk中没有实现</p>
<p>接口api请参考https://tushare.pro/document/2</p>
<p>未来看兔子给分情况决定增加异步api，定时任务等功能</p>
<p>有什么功能需要欢迎issue</p>
<p>虽然你在我这里提估计我没有分可给你，但你给我点分的话我会考虑优先搞</p>
<p>所以这其实就是个凑不要脸的骗分项目.jpg</p>

<p>api调用示例(这里以官方stock_basic接口为例)：</p>

	// 首先构造一个ToShare对象,以用户token为参数
	// 每次http请求会发送此token
	ToShare toshare = new ToShare("token");
	
	// 然后构造stock_basic接口的参数
	// 参数对象名就是接口名的驼峰命名法写法+Param
	// 所有接口统一用此命名模式
	StockBasicParam param = new StockBasicParam();
	
	// 注入参数，这里参考官方python示例
	// 查询当前所有正常上市交易的股票列表
	// python版本：
	// data = pro.stock_basic(exchange='', list_status='L', fields='ts_code,symbol,name,area,industry,list_date')
	param.setExchange("");
	param.setListStatus("L");
	String fields = "ts_code,symbol,name,area,industry,list_date";
	
	// 调用接口获取数据
	Collection<StockBasicResponse> response = toShare.stock_basic(param, fields);
	// do sth with the response collection...

<p>除了传统的调用方式以外，为喜欢lambda和函数式调用的同学准备了基于回调函数的接口：</p>
	
	// 通过回调函数处理结果
	toShare.stock_basic(request, fields, resposne -> {
		// do sth with the response collection
	});

<p>此外，还有比较浅层的封装方式，可以直接通过http接口的字段对数据进行调用：</p>

	// 首先声明ToShare对象
	ToShare toShare = new ToShare("token");
	
	// 封装request对象
	// 一共有4个参数，参考https://tushare.pro/document/1?doc_id=130
	// 其中token在声明toShare对象时已经输入进去了，所以还需要设置三个参数
	
	BasicRequest request = new BasicReqeust();
	request.setApi_name("stock_basic");
	request.setParams("{\"exchange\": \"\", \"list_status\": \"L\"}");
	request.setFileds("ts_code,symbol,name,area,industry,list_date");
	// 如果你需要设置一个跟前面不一样的token，也可以。
	// 在本次http请求中以你设置的token为准。
	// 这并不会改变toShare对象自身的token值。
	// request.setToken("new token");
	
	// 调用接口获得数据
	Collection<Map<String, Object>> dataCollection = toShare.http_api(request);
	// do sth with the response collection...
	
<p>同样，浅层封装也实现了回调函数处理的api：</p>
			
	// 在回调函数中处理数据
	toShare.http_api(request, response -> {
		// do sth with the response collection...
	});

<P>目前，沪深股票、行情数据和财务数据的相关接口可以使用上述的四种调用方式</P>
<p>其他接口的api封装暂未完成，可以通过浅层http封装进行调用</p>
	
