package com.javaacademy.lessons.homework.ex1.animals;

public class Bird extends Animal {
    private static final TypeAnimal TYPE_ANIMAL = TypeAnimal.BIRD;

    public Bird() {
        super(TYPE_ANIMAL);
    }

    public void fly() {
        System.out.println("Птица летит!");
    }
}
