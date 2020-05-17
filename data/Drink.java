package org.example.data;

public class Drink extends Product{
    private int calories;
    private int size;

    public Drink(int productId, String productName, int prize, int calories, int size) {
        super(productId, productName, prize);
        this.calories = calories;
        this.size = size;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String use(){
        return "Consume";
    }

    @Override
    public String examine() {
        return this.toString();
    }

}
