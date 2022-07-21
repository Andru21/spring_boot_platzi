package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
//@Primary-> Usado para especificar cuál Bean es el que se usara siempre y cuando haya más de uno implementando la dependencia
public class ComponentTwoImplement implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Implementación 2 de la dependencia ComponentDependency para ejemplo de inyección con dos clases implementando la dependencia");
    }
}
