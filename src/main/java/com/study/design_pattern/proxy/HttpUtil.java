package com.study.design_pattern.proxy;

public class HttpUtil implements IHttp{
    @Override
    public void request(String sendDate) {
        System.out.println("发送请求...");
    }

    @Override
    public void onSuccess(String receiveData) {
        System.out.println("接收数据...");
    }
}
