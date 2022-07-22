package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{
    //Inyeccion de dependencia MuOperation dentro de una implemetacion de otra dependencia
    private MyOperation myOperation;

    private final Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }
    //Esta implemenetacion a demas de tener esta misma tiene una inyeccion de una dependencia para usar su metodo sum
    @Override
    public void printWithDependency() {
        LOGGER.info("En este punto estas en el metodo printWithDependency");
        int numero = 5;
        LOGGER.debug("Debugeando el valor de la variable numero: " + numero);
        System.out.println("Implementando una dependencia dentro de otra dependencia, la primera para imprimir este mensaje y la segunda para imprimir este numero" + myOperation.sum(numero));
    }
}
