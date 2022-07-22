package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanTwoImplement implements MyBean {
    private final Log LOGGER = LogFactory.getLog(MyBeanTwoImplement.class);
    @Override
    public void print() {
        LOGGER.info("Estamos en la segunda implementacion de la intefaz MyBean");
        System.out.println("Imprimiendo desde mi implementación 2 propia del Bean 2");
    }
}
