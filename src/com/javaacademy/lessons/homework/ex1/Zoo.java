package com.javaacademy.lessons.homework.ex1;

import com.javaacademy.lessons.homework.ex1.animals.Animal;

public class Zoo<T, S, V extends Animal> {
    private final T animal1;
    private final S animal2;
    private final V animal3;

    public Zoo(T animal1, S animal2, V animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public T getAnimal1() {
        return animal1;
    }

    public S getAnimal2() {
        return animal2;
    }

    public V getAnimal3() {
        return animal3;
    }
}
