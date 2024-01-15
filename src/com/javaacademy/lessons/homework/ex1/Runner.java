package com.javaacademy.lessons.homework.ex1;

import com.javaacademy.lessons.homework.ex1.animals.Bird;
import com.javaacademy.lessons.homework.ex1.animals.Dog;
import com.javaacademy.lessons.homework.ex1.animals.Tiger;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Tiger tiger = new Tiger();
        Zoo<Dog, Bird, Tiger> zoo = new Zoo<>(dog, bird, tiger);
        Dog dog2 = zoo.getAnimal1();
        dog2.bark();
        Bird bird2 = zoo.getAnimal2();
        bird2.fly();
        Tiger tiger2 = zoo.getAnimal3();
        tiger2.roar();
    }
}
