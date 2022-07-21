package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{
    //Inyeccion de dependencia MuOperation dentro de una implemetacion de otra dependencia
    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }
    //Esta implemenetacion a demas de tener esta misma tiene una inyeccion de una dependencia para usar su metodo sum
    @Override
    public void printWithDependency() {
        int numero = 5;
        System.out.println("Implementando una dependencia dentro de otra dependencia, la primera para imprimir este mensaje y la segunda para imprimir este numero" + myOperation.sum(numero));
    }
}
