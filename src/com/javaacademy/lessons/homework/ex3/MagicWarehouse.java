package com.javaacademy.lessons.homework.ex3;

import java.util.ArrayList;
import java.util.List;

public class MagicWarehouse {
    private final List<Item> listItems = new ArrayList<>();

    public void addItem(Item item) {
        listItems.add(item);
    }

    public void addItems(List<Item> listItems) {
        this.listItems.addAll(listItems);
    }

    public List<Item> getEvenListItems() {
        List<Item> resultList = new ArrayList<>();
        for (int i = 0; i < listItems.size(); i = i + 2) {
            resultList.add(listItems.get(i));
        }
        return resultList;
    }

    public Item getItem(int index) {
        Item item = listItems.get(index);
        listItems.remove(index);
        return item;
    }

    public void removeItemExceptLast() {
        Item item = listItems.get(listItems.size() - 1);
        listItems.clear();
        listItems.add(item);
    }

    @Override
    public String toString() {
        return "MagicWarehouse{"
                + "listItems=" + listItems
                + '}';
    }
}
