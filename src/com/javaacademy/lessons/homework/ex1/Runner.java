package com.javaacademy.lessons.homework.ex1;

import com.javaacademy.lessons.homework.ex1.animals.*;
import com.javaacademy.lessons.homework.ex1.zoo.Zoo;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Tiger tiger = new Tiger();
        Zoo zoo = new Zoo();
        zoo.addAnimal(dog);
        zoo.addAnimal(bird);
        zoo.addAnimal(tiger);
        Dog dog1 = zoo.getAnimal(TypeAnimal.DOG);
        dog1.makeSound();
        Tiger tiger1 = zoo.getAnimal(TypeAnimal.TIGER);
        tiger1.makeSound();
        Bird bird1 = zoo.getAnimal(TypeAnimal.BIRD);
        bird1.fly();
    }
}
