package com.study.design_pattern.proxy;

public class Person implements IPerson{
    @Override
    public void eat() {
        System.out.println("eating...");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping...");
    }
}
