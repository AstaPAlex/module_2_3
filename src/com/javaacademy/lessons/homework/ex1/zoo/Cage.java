package com.javaacademy.lessons.homework.ex1.zoo;


import com.javaacademy.lessons.homework.ex1.animals.Animal;
import com.javaacademy.lessons.homework.ex1.animals.TypeAnimal;
import java.util.ArrayList;
import java.util.List;

public class Cage<T extends Animal> {
    private TypeAnimal typeAnimal;
    private List<T> animals;

    public Cage(T animal) {
        animals = new ArrayList<>();
        typeAnimal = animal.getTypeAnimal();
        animals.add(animal);
    }

    public TypeAnimal getTypeAnimal() {
        return typeAnimal;
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public T getAnimal() {
        T animal = animals.get(animals.size() - 1);
        animals.remove(animals.size() - 1);
        return animal;
    }

}
