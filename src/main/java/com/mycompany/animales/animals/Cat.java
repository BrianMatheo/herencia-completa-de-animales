package com.mycompany.animales.animals;

public class Cat extends Animals {
    String color;

    public Cat(String specie, String gender, int size, String name, String color) {
        super(specie, gender, size, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public void play(){
        System.out.println("soy un gato jugando");
    }
    
    @Override
    public void talk(){
        System.out.println("miau");
    }
}
