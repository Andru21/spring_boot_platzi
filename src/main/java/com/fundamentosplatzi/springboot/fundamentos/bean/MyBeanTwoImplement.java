package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanTwoImplement implements MyBean {
    @Override
    public void print() {
        System.out.println("Imprimiendo desde mi implementación 2 propia del Bean 2");
    }
}
