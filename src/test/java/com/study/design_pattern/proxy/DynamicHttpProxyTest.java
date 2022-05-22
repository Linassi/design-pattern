package com.study.design_pattern.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicHttpProxyTest {
    @Test
    void test(){
        HttpUtil httpUtil = new HttpUtil();
        IHttp proxy = new DynamicHttpProxy().getInstance(httpUtil);
        proxy.request("发送");
        proxy.onSuccess("接收");
    }
}