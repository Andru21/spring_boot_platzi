package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import com.fundamentosplatzi.springboot.fundamentos.personalize.WheeImplement;
import com.fundamentosplatzi.springboot.fundamentos.personalize.Wheel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        //El retorno de la implementacion permite ejecutar la implementacion que se desee en caso de tener varias de ellas
        return new MyBeanTwoImplement();
    }
//Otra configuracion de un nuevo Bean
    @Bean
    public MyOperation sumOperation(){
        //El retorno de la implementacion permite ejecutar la implementacion que se desee en caso de tener varias de ellas
        return new MyOperationImplement();
    }
//Configuracion de una dependencia con otra dependencia dentro
    @Bean
    public MyBeanWithDependency beanWithDependency(MyOperation myOperation){
        //El retorno de la implementacion permite ejecutar la implementacion que se desee en caso de tener varias de ellas
        return new MyBeanWithDependencyImplement(myOperation);
    }
    //Configuracion de dependencia Personalizada
    @Bean
    public Wheel wheel(){
        //El retorno de la implementacion permite ejecutar la implementacion que se desee en caso de tener varias de ellas
        return new WheeImplement();
    }
}
