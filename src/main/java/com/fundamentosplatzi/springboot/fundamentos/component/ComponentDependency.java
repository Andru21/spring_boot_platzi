package com.fundamentosplatzi.springboot.fundamentos.component;
//Dependencia para inyectar en distintos lugares de la aplicación
//Segregar la implementación en dos clases es lo que hicimos ahora, entonces el proceso de segregación es implementar en clases dependencias
public interface ComponentDependency {
    void saludar();
}
