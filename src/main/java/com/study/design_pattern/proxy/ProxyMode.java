package com.study.design_pattern.proxy;

public class ProxyMode {
    public static void main(String[] args) {
        Person person = new Person();
        PersonProxy proxy = new PersonProxy(person);
        proxy.eat();
    }
}
