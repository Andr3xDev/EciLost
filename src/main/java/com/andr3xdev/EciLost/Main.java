package com.andr3xdev.EciLost;

import Items_type.Item;

public class Main {
    public static void main(String[] args) {

        String name = "amando mas";
        String description = "arroz";

        Item a = new Item(name, description);
        a.setName("a");
        System.out.println(a.getName());
        System.out.println(a.toString());
    }
}