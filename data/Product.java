package org.example.data;

public abstract class Product {
    public static int counter=0;
    private int productId;
    private String productName;
    private int prize;


    // Constructor

    public Product(int productId, String productName, int prize) {
        this.productId = ++counter;
        setProductName(productName);
        setPrize(prize);
    }


    //Getters Setters


    public int getProductId() {

        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

       @Override
    public String toString() {
        return
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", prize=" + prize ;
    }

   public abstract String use();
   public abstract String examine();

}
