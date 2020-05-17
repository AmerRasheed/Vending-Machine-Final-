package org.example.model;



import org.example.data.Product;

/*o void addCurrency (int amount) - Add to the deposit pool (moneyPool).
  o Product request (int productNumber) - Buy a Product.
  o int endSession () Returns change and resets the deposit pool.
  o String getDescription (int productNumber) - View a product description.
  o int getBalance () - Returns the deposit pool amount.
  o String [] getProducts () - Returns all Products' names and product numbers.
* */
    public interface VendingMachine {
        void addCurrency(int amount);
        Product request(int productId);

        void callmenu();

        int endSession();
        String getDescription(int productNumber);
        int getBalance();
        String[] getProducts();
    }

