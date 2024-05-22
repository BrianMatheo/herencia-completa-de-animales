package com.mycompany.animales.animals;
public class Dog extends Animals{
    private String fur;

    public Dog(String specie, String gender, int size, String name, String fur) {
        super(specie, gender, size, name);
        this.fur = fur;
    }
    
    public void sniff(){
        System.out.println("Soy un perro olfateando");
    }
    
    @Override
    public void talk(){
        System.out.println("Guau guau!");
    }
    
}
