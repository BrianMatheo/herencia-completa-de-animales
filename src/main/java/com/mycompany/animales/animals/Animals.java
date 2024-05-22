
package com.mycompany.animales.animals;
public class Animals {
    private String specie;
    private String gender;
    private int size;
    private String name;

    public Animals(String specie, String gender, int size, String name) {
        this.specie = specie;
        this.gender = gender;
        this.size = size;
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public String getGender() {
        return gender;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
    
    
    
    public void talk(){
        System.out.println("say something");
    }
    
    
    
}
