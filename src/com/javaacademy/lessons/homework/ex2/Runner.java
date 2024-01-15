package com.javaacademy.lessons.homework.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 3, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 10));
        List<Integer> listFinal = new ArrayList<>();
        listFinal.addAll(list1);
        listFinal.addAll(list2);
        listFinal.remove(3);
        System.out.println(listFinal.indexOf(10));
    }

}
