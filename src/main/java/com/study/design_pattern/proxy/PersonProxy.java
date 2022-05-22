package com.study.design_pattern.proxy;

public class PersonProxy implements IPerson{

    private final Person person;

    public PersonProxy(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        System.out.println("吃饭前先洗手...");
        person.eat();
    }

    @Override
    public void sleep() {
        person.sleep();
    }
}
