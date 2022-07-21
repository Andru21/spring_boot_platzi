package com.fundamentosplatzi.springboot.fundamentos.personalize;

import org.springframework.context.annotation.Primary;

public class WheelTwoImplement implements Wheel{
    @Override
    @Primary
    public void rodar() {
        System.out.println("Prueba de rodamientos de las llantas del carro");
    }
}
