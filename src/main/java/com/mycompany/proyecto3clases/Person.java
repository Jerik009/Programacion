package com.mycompany.proyecto3clases;

public class Person {

    /*Atributos*/
    public String name;
    public byte age;

    /*Metodos*/
    public void drive(boolean state) {
        if (state) {
            System.out.println(name + " Puedes manejar");
        } else {
            System.out.println(name + " Enciende el carro");
        }
    }

    public void getin() {
        System.out.println("Ingresaste al carro");
    }

    public void getout() {
        System.out.println("Saliste del carro");
    }
}
