package com.xpecya;

import com.xpecya.requestStruct.*;
import com.xpecya.responseStruct.*;

import java.util.Collection;
import java.util.function.Consumer;

@SuppressWarnings("unused")
public class ToShare {

    private String token;

    public ToShare(String token) {
        this.token = token;
    }

    private BasicRequest<Param> getRequest(Param request, String fields) {
        BasicRequest<Param> basicRequest = new BasicRequest<>();
        basicRequest.setApi_name(request.getApiName());
        basicRequest.setFields(fields);
        basicRequest.setToken(token);
        basicRequest.setParams(request);
        return basicRequest;
    }

    private BasicRequest<Param> getVipRequest(VipParam request, String fields) {
        BasicRequest<Param> basicRequest = new BasicRequest<>();
        basicRequest.setApi_name(request.getVipApiName());
        basicRequest.setFields(fields);
        basicRequest.setToken(token);
        basicRequest.setParams(request);
        return basicRequest;
    }

    @SuppressWarnings("unchecked")
    private <Res> Collection<Res> request(Param request, Class<Res> responseClass, String fields) {
        BasicRequest<Param> basicRequest = getRequest(request, fields);
        Collection<Res>[] responseContainer = new Collection[1];
        HttpUtil.sendRequest(basicRequest, responseClass,
                response -> responseContainer[0] = response);
        return responseContainer[0];
    }

    private <Res> void request(Param request, Class<Res> responseClass,
                                    String fields, Consumer<Collection<Res>> handler) {
        BasicRequest<Param> basicRequest = getRequest(request, fields);
        HttpUtil.sendRequest(basicRequest, responseClass, handler);
    }

    private <Res> Collection<Res> vipRequest(VipParam request, Class<Res> responseClass, String fields) {
        BasicRequest<Param> basicRequest = getVipRequest(request, fields);
        Collection<Res>[] responseContainer = new Collection[1];
        HttpUtil.sendRequest(basicRequest, responseClass,
                response -> responseContainer[0] = response);
        return responseContainer[0];
    }

    private <Res> void vipRequest(VipParam request, Class<Res> responseClass,
                               String fields, Consumer<Collection<Res>> handler) {
        BasicRequest<Param> basicRequest = getVipRequest(request, fields);
        HttpUtil.sendRequest(basicRequest, responseClass, handler);
    }

    public void stock_basic(StockBasicParam request,
                            String fields, Consumer<Collection<StockBasicResponse>> handler) {
        request(request, StockBasicResponse.class, fields, handler);
    }

    public Collection<StockBasicResponse> stock_basic(StockBasicParam request, String fields) {
        return request(request, StockBasicResponse.class, fields);
    }

    public void trade_cal(TradeCalParam request,
                          String fields, Consumer<Collection<TradeCalResponse>> handler) {
        request(request, TradeCalResponse.class, fields, handler);
    }

    public Collection<TradeCalResponse> trade_cal(TradeCalParam request, String fields) {
        return request(request, TradeCalResponse.class, fields);
    }

    public void name_change(NameChangeParam request,
                            String fields, Consumer<Collection<NameChangeResponse>> handler) {
        request(request, NameChangeResponse.class, fields, handler);
    }

    public Collection<NameChangeResponse> name_change(NameChangeParam request,
                                                    String fields) {
        return request(request, NameChangeResponse.class, fields);
    }

    public void hs_const(HsConstParam request,
                         String fields, Consumer<Collection<HsConstResponse>> handler) {
        request(request, HsConstResponse.class, fields, handler);
    }

    public Collection<HsConstResponse> hs_const(HsConstParam request,
                                                      String fields) {
        return request(request, HsConstResponse.class, fields);
    }

    public void stock_company(StockCompanyParam request,
                              String fields, Consumer<Collection<StockCompanyResponse>> handler) {
        request(request, StockCompanyResponse.class, fields, handler);
    }

    public Collection<StockCompanyResponse> stock_company(StockCompanyParam request,
                                                String fields) {
        return request(request, StockCompanyResponse.class, fields);
    }

    public void stk_managers(StkManagersParam request,
                              String fields, Consumer<Collection<StkManagersResponse>> handler) {
        request(request, StkManagersResponse.class, fields, handler);
    }

    public Collection<StkManagersResponse> stock_company(StkManagersParam request,
                                                          String fields) {
        return request(request, StkManagersResponse.class, fields);
    }

    public void stk_rewards(StkRewardsParam request,
                             String fields, Consumer<Collection<StkRewardsResponse>> handler) {
        request(request, StkRewardsResponse.class, fields, handler);
    }

    public Collection<StkRewardsResponse> stock_company(StkRewardsParam request,
                                                         String fields) {
        return request(request, StkRewardsResponse.class, fields);
    }

    public void new_share(NewShareParam request,
                            String fields, Consumer<Collection<NewShareResponse>> handler) {
        request(request, NewShareResponse.class, fields, handler);
    }

    public Collection<NewShareResponse> new_share(NewShareParam request,
                                                        String fields) {
        return request(request, NewShareResponse.class, fields);
    }

    public void daily(DailyParam request,
                          String fields, Consumer<Collection<DailyResponse>> handler) {
        request(request, DailyResponse.class, fields, handler);
    }

    public Collection<DailyResponse> daily(DailyParam request,
                                                  String fields) {
        return request(request, DailyResponse.class, fields);
    }

    public void weekly(WeeklyParam request,
                      String fields, Consumer<Collection<WeeklyResponse>> handler) {
        request(request, WeeklyResponse.class, fields, handler);
    }

    public Collection<WeeklyResponse> weekly(WeeklyParam request,
                                           String fields) {
        return request(request, WeeklyResponse.class, fields);
    }

    public void monthly(MonthlyParam request,
                       String fields, Consumer<Collection<MonthlyResponse>> handler) {
        request(request, MonthlyResponse.class, fields, handler);
    }

    public Collection<MonthlyResponse> monthly(MonthlyParam request,
                                             String fields) {
        return request(request, MonthlyResponse.class, fields);
    }

    public void adj_factor(AdjFactorParam request,
                        String fields, Consumer<Collection<AdjFactorResponse>> handler) {
        request(request, AdjFactorResponse.class, fields, handler);
    }

    public Collection<AdjFactorResponse> adj_factor(AdjFactorParam request,
                                               String fields) {
        return request(request, AdjFactorResponse.class, fields);
    }

    public void suspend(SuspendParam request,
                           String fields, Consumer<Collection<SuspendResponse>> handler) {
        request(request, SuspendResponse.class, fields, handler);
    }

    public Collection<SuspendResponse> suspend(SuspendParam request,
                                                    String fields) {
        return request(request, SuspendResponse.class, fields);
    }

    public void daily_basic(DailyBasicParam request,
                        String fields, Consumer<Collection<SuspendResponse>> handler) {
        request(request, SuspendResponse.class, fields, handler);
    }

    public Collection<SuspendResponse> daily_basic(DailyBasicParam request,
                                               String fields) {
        return request(request, SuspendResponse.class, fields);
    }

    public void money_flow(MoneyFlowParam request,
                            String fields, Consumer<Collection<MoneyFlowResponse>> handler) {
        request(request, MoneyFlowResponse.class, fields, handler);
    }

    public Collection<MoneyFlowResponse> money_flow(MoneyFlowParam request,
                                                   String fields) {
        return request(request, MoneyFlowResponse.class, fields);
    }

    public void stk_limit(StkLimitParam request,
                           String fields, Consumer<Collection<StkLimitResponse>> handler) {
        request(request, StkLimitResponse.class, fields, handler);
    }

    public Collection<StkLimitResponse> stk_limit(StkLimitParam request,
                                                    String fields) {
        return request(request, StkLimitResponse.class, fields);
    }

    public void limit_list(LimitListParam request,
                          String fields, Consumer<Collection<LimitListResponse>> handler) {
        request(request, LimitListResponse.class, fields, handler);
    }

    public Collection<LimitListResponse> limit_list(LimitListParam request,
                                                  String fields) {
        return request(request, LimitListResponse.class, fields);
    }

    public void money_flow_hsgt(MoneyFlowHsgtParam request,
                                String fields, Consumer<Collection<MoneyFlowHsgtResponse>> handler) {
        request(request, MoneyFlowHsgtResponse.class, fields, handler);
    }

    public Collection<MoneyFlowHsgtResponse> money_flow_hsgt(MoneyFlowHsgtParam request,
                                                    String fields) {
        return request(request, MoneyFlowHsgtResponse.class, fields);
    }

    public void hsgt_top10(HsgtTop10Param request,
                                String fields, Consumer<Collection<HsgtTop10Response>> handler) {
        request(request, HsgtTop10Response.class, fields, handler);
    }

    public Collection<HsgtTop10Response> hsgt_top10(HsgtTop10Param request,
                                                             String fields) {
        return request(request, HsgtTop10Response.class, fields);
    }

    public void hk_hold(HkHoldParam request,
                           String fields, Consumer<Collection<HkHoldResponse>> handler) {
        request(request, HkHoldResponse.class, fields, handler);
    }

    public Collection<HkHoldResponse> hk_hold(HkHoldParam request,
                                                    String fields) {
        return request(request, HkHoldResponse.class, fields);
    }

    public void ggt_daily(GgtDailyParam request,
                        String fields, Consumer<Collection<GgtDailyResponse>> handler) {
        request(request, GgtDailyResponse.class, fields, handler);
    }

    public Collection<GgtDailyResponse> ggt_daily(GgtDailyParam request,
                                              String fields) {
        return request(request, GgtDailyResponse.class, fields);
    }

    public void ggt_monthly(GgtMonthlyParam request,
                          String fields, Consumer<Collection<GgtMonthlyResponse>> handler) {
        request(request, GgtMonthlyResponse.class, fields, handler);
    }

    public Collection<GgtMonthlyResponse> ggt_monthly(GgtMonthlyParam request,
                                                  String fields) {
        return request(request, GgtMonthlyResponse.class, fields);
    }

    public void income(IncomeParam request,
                            String fields, Consumer<Collection<IncomeResponse>> handler) {
        request(request, IncomeResponse.class, fields, handler);
    }

    public Collection<IncomeResponse> income(IncomeParam request,
                                                      String fields) {
        return request(request, IncomeResponse.class, fields);
    }

    public void income_vip(IncomeParam request,
                       String fields, Consumer<Collection<IncomeResponse>> handler) {
        vipRequest(request, IncomeResponse.class, fields, handler);
    }

    public Collection<IncomeResponse> income_vip(IncomeParam request,
                                             String fields) {
        return vipRequest(request, IncomeResponse.class, fields);
    }
}
