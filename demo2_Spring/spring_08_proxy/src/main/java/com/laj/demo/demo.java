package com.laj.demo;

public class demo {
    public static void main(String[] args) {
        PersonImpl person = new PersonImpl();
        Proxy proxy = new Proxy(person);

        proxy.setPerson(person);
        Person proxy1 = (Person)proxy.getProxy();
        proxy1.action1();
        proxy1.action2();
    }
}
