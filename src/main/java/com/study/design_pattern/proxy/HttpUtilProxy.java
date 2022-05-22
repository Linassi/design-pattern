package com.study.design_pattern.proxy;

public class HttpUtilProxy implements IHttp{
    private final HttpUtil httpUtil;

    public HttpUtilProxy(HttpUtil httpUtil) {
        this.httpUtil = httpUtil;
    }

    @Override
    public void request(String sendDate) {
        System.out.println("before send...");
        httpUtil.request(sendDate);
    }

    @Override
    public void onSuccess(String receiveData) {
        System.out.println("before receive...");
        httpUtil.onSuccess(receiveData);
    }
}
