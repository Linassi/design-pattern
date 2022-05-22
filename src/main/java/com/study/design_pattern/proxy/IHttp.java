package com.study.design_pattern.proxy;

public interface IHttp {
    void request(String sendDate);
    void onSuccess(String receiveData);
}
