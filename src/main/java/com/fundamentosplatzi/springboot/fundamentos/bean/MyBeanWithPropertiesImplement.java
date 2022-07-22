package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithPropertiesImplement implements MyBeanWithProperties{
    private final Log LOGGER = LogFactory.getLog(MyBeanWithPropertiesImplement.class);
    //representacion de los parametros enviados por la instancia de la clase
    private String name;
    private String apellido;

    public MyBeanWithPropertiesImplement(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
    }

    @Override
    public String function() {
        LOGGER.info("Estamos en la implementacion de la interfaz MyBeanWithProperties");
        LOGGER.debug("El valor de la propiedad name es: " + name);
        LOGGER.debug("El valor de la propiedad apellido es: " + apellido);
        return name +' '+ apellido;
    }
}
