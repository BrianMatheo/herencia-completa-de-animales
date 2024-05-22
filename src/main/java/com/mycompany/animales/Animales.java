package com.mycompany.animales;
import com.mycompany.animales.animals.Animals;
import com.mycompany.animales.animals.Cat;
import com.mycompany.animales.animals.Dog;
public class Animales {

    public static void main(String[] args) {
        
        Animals animal = new Animals("desconocido","macho",50,"Arlec");
        
        Cat cat = new Cat("desconocido","hembra",21,"nose","amarillo");
        Cat cat2 = new Cat("desconocido","hembra",21,"co","amarillo");
        
        Dog dog = new Dog("Mamifero", "Macho", 80, "perro", "Corto");
        
        animal.talk();
        cat2.talk();
        dog.talk();
        
        System.out.println(cat.getColor()); 
        System.out.println(cat2.getName());
    }
}