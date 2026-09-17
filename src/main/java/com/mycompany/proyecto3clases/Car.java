package com.mycompany.proyecto3clases;

public class Car {

    /*Atributos*/
    public String color;
    public String marca;
    public String modelo;
    public boolean estado;
    public String placa;

    /*Metodos*/
    public void encender() {
        System.out.println("El carro esta encendido");
    }

    public void apagar() {
        System.out.println("El carro esta apagado");
    }

    public void acelerar() {
        System.out.println("Aceleraste");
    }

    public void frenar() {
        System.out.println("Frenaste");
    }

}
