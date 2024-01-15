package com.javaacademy.lessons.homework.ex1.animals;

public abstract class Animal {
    protected final TypeAnimal typeAnimal;

    public Animal(TypeAnimal typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public TypeAnimal getTypeAnimal() {
        return typeAnimal;
    }
}
