package com.javaacademy.lessons.homework.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Item item1 = new Item("Бра");
        Item item2 = new Item("Еда");
        Item item3 = new Item("Лев");
        Item item4 = new Item("Око");
        MagicWarehouse magicWarehouse = new MagicWarehouse();
        magicWarehouse.addItem(item1);
        magicWarehouse.addItem(item2);
        magicWarehouse.addItem(item3);
        magicWarehouse.addItem(item4);
        System.out.println(magicWarehouse);
        List<Item> listItems = new ArrayList<>(Arrays.asList(item1, item2, item3, item4));
        magicWarehouse.addItems(listItems);
        System.out.println(magicWarehouse);
        System.out.println(magicWarehouse.getEvenListItems().toString());
        System.out.println(magicWarehouse.getItem(3));
        System.out.println(magicWarehouse);
        magicWarehouse.removeItemExceptLast();
        System.out.println(magicWarehouse);
    }
}
