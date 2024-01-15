package com.javaacademy.lessons.homework.ex1.zoo;

import com.javaacademy.lessons.homework.ex1.animals.Animal;
import com.javaacademy.lessons.homework.ex1.animals.TypeAnimal;
import com.javaacademy.lessons.homework.ex1.exception.NoHaveCageWithAnimalTypeException;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static final int MAX_NUMBER_ANIMAL_TYPES = 3;
    private final List<Cage> cageList = new ArrayList<>();

    public <T extends Animal> void addAnimal(T animal) {
        try {
            getCageWithAnimal(animal.getTypeAnimal()).addAnimal(animal);
        } catch (NoHaveCageWithAnimalTypeException e) {
            if (cageList.size() < MAX_NUMBER_ANIMAL_TYPES) {
                cageList.add(new Cage<T>(animal));
            } else {
                System.out.println("В зоопарк нельзя добавить новое животное! В зоопарке нет мест!");
            }
        }
    }

    public <T extends Animal> T getAnimal(TypeAnimal typeAnimal) {
        Cage<T> cage;
        try {
            cage = getCageWithAnimal(typeAnimal);
            return cage.getAnimal();
        } catch (NoHaveCageWithAnimalTypeException e) {
            throw  new RuntimeException("Такого животного в зоопарке нет!");
        }
    }

    private <T extends Animal> Cage<T> getCageWithAnimal(TypeAnimal typeAnimal)
            throws NoHaveCageWithAnimalTypeException {
        for (var cage : cageList) {
            if (cage.getTypeAnimal().equals(typeAnimal)) {
                return cage;
            }
        }
        throw new NoHaveCageWithAnimalTypeException();
    }

}
