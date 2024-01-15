package com.javaacademy.lessons.homework.ex1.animals;

import com.javaacademy.lessons.homework.ex1.animals.interfaces.MakeSound;

public class Tiger extends Animal implements MakeSound {
    private static final TypeAnimal TYPE_ANIMAL = TypeAnimal.TIGER;

    public Tiger() {
        super(TYPE_ANIMAL);
    }

    @Override
    public void makeSound() {
        System.out.println("Тигр рычит!");
    }
}
