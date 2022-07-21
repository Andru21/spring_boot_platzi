package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Implementando la dependencia ComponentDependency para usar el metodo saludar para posteriormente inyectarla en FuncamentosApplication y posteriormente usarla en el metodo run de la implementacion CommandLineRunner");
    }
}
