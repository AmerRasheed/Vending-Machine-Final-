package org.example.model;

import org.example.data.Fruit;
import org.example.data.Items;
import org.example.data.Product;

public class VendingMachineImplements1 implements VendingMachine {
    int pool = 0;
     //Fruit[] fproducts = new Fruit[0];
    // Array of product
    //items coming from APP. addproduc should be stored in this array PRODUCT
    //deposit pool 5+ 1000 +500
    @Override
    public void addCurrency(int amount) {

        pool = pool + amount;
        System.out.println("The credit amount is" + pool);
    }
/*
* public static int getDenInput(Denominations...denominations) {
        int sum = 0;
        for (Denominations den : denominations) {
            sum = sum + den.getDenInput();

        }
        * */
/*
if (balance < 0)
                    System.out.println("Insufficient balance");
                else {
                    System.out.println("The item no. you selected is " + arrInt[i].getProductId() + " item Name is " + arrInt[i].getProductName());
                    return arrInt[i];
                }
*/

    @Override
    public Product request(int productId) {
        Items itemint = new Items();
        Product[] arrInt = itemint.findAll();
        for (int i = 0; i < arrInt.length; i++)
            if (productId == arrInt[i].getProductId()) {
                System.out.println("The item no. you selected is " + arrInt[i].getProductId() + " item Name is " + arrInt[i].getProductName());
                int balance = pool - arrInt[i].getPrize();
                if(balance<0)
                    System.out.println("Please put more money in the VM. Your choice is below your MONEY BALANCE");
                pool = balance;
                System.out.println("Availabe balance is " + pool);
                return arrInt[i];
            }
        //   System.out.print(arrInt[i].getProductId());
        // System.out.print(arrInt[i].getProductName());
        //System.out.println(arrInt[i].getPrize());
        //
        callmenu();
        //pool-item prize
        //display pool balance
        return null;
    }

    @Override
    public void callmenu() {
        System.out.println("We are offering following products TODAY     ");
        System.out.println("Item No.     Product Name         Item Prize ");
        /*System.out.println("Pepsi ..............................8 SEK");
        System.out.println("Banana .............................8 SEK");
        System.out.println("Egg Sandwitch.......................8 SEK");
        System.out.println("Kit Kat.............................8 SEK");*/

    }

    @Override
    public int endSession() {
        System.out.println("Your balance is " + pool);
        int change = pool;

        int Thousands = change / 1000;
        // change %= 100;
        change = change % 1000;

        int FiveHundreds = change / 500;
        change = change % 500;

        int TwoHundreds = change / 200;
        change = change % 200;

        int Hundreds = change / 100;
        // change %= 100;
        change = change % 100;

        int Fiftys = change / 50;
        change = change % 50;

        int Twenties = change / 20;
        change = change % 20;

        int Tens = change / 10;
        change = change % 10;

        int Fives = change / 5;
        // change %= 100;
        change = change % 5;

        int Twos = change / 2;
        change = change % 2;

        int Ores = change;
        change = change % 1;

        System.out.print("Thousands " + Thousands + "\nFiveHundreds " + FiveHundreds + "\nTwoHundreds " +
                TwoHundreds + "\nHundreds " + Hundreds + "\nFifties " + Fiftys + "\nTwenties" + Twenties + "\nTen s" + Tens +
                "\nFives " + Fives + "\nTwos " + Twos + "\nOres " + Ores + "\n");
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        Items itemint = new Items();
        Product[] arrInt = itemint.findAll();
        for (int i = 0; i < arrInt.length; i++)
            if (productNumber == arrInt[i].getProductId()) {
                System.out.print(
                        "The item no. you selected is                   " + arrInt[i].getProductId() +
                        "\n item Name is                    " + arrInt[i].getProductName()+
                        "\nItem description                               ");
                                //+arrInt[i].getCalories()+"\n");
            }
        return this.toString();
    }

    @Override
    public int getBalance() {
        System.out.println("Current pool balance is " + pool);
        return pool;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
