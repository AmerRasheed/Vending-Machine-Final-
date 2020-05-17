package org.example.data;

import java.util.Arrays;

public class Items {
    private static Fruit[] items = new Fruit[0];

    public int size() {

        return items.length;
    }

    public Fruit[] findAll() {
        return items;
    }



    public Fruit addProduct(String ProductName, int itemPrize) {
        //Product item = new Product(1,ProductName,itemPrize);
        Fruit fruititems = new Fruit(1,ProductName,itemPrize,80);
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = fruititems;
        return fruititems;
    }
}
