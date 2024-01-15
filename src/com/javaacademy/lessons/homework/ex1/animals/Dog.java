package com.javaacademy.lessons.homework.ex1.animals;

import com.javaacademy.lessons.homework.ex1.animals.interfaces.MakeSound;

public class Dog extends Animal implements MakeSound {
    private static final TypeAnimal TYPE_ANIMAL = TypeAnimal.DOG;

    public Dog() {
        super(TYPE_ANIMAL);
    }

    @Override
    public void makeSound() {
        System.out.println("Собака лает!");
    }
}
