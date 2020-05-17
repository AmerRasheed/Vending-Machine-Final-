package org.example.data;

public class Sweet extends Product {
    private int calories;

    public Sweet(int productId, String productName, int prize, int calories) {
        super(productId, productName, prize);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String use() {
        return "Consume";
    }

    @Override
    public String examine() {
        return this.toString();
    }
}
