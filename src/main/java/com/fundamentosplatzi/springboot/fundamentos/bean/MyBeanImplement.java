package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanImplement implements MyBean {
    private final Log LOGGER = LogFactory.getLog(MyBeanImplement.class);
    @Override
    public void print() {
        LOGGER.info("Estamos en la clase Implementación de MyBean");
        System.out.println("Imprimiendo desde mi implementación");
    }
}
