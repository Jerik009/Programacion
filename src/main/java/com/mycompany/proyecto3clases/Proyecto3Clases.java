package com.mycompany.proyecto3clases;

public class Proyecto3Clases {

    public static void main(String[] args) {
        //Crear un objeto

        int numero = 10;
        Car carOne = new Car();
        carOne.encender();
        
        Car carTwo = new Car();
        carTwo.encender();
        
        Person personOne = new Person();
        personOne.name = "Alejandro";
        personOne.drive(true);
        
        Person personTwo = new Person();
        personOne.name = "Jerik";
        personOne.drive(true);
        
        Person personThree = new Person();
        personThree.name = "Walter";
        personThree.drive(false);
        
        
    }
}
