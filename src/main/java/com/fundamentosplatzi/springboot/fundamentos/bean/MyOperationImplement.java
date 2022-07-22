package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyOperationImplement implements MyOperation {
    Log LOGGER = LogFactory.getLog(MyOperationImplement.class);
    @Override
    public int sum(int number) {
        LOGGER.info("Estamos en la implementacion de la interfaz MyOperationImplement");
        LOGGER.debug("El valor asignado a number es: " + number);
        return number + 1;
    }
}
