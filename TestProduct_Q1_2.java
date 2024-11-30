package task2.solution1_2;

import java.util.Scanner;

public class TestProduct_Q1_2 { // class with main method
    // Main method
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in); // Scanner class object to get user input

        Product_Q1_2[] products =new Product_Q1_2[5]; // creates an array to store 5 Product objects
        // Loop to read input for 5 products and create Product objects
        for(int i=0;i<5;i++){
            int pid=obj.nextInt(); // reads pid from user
            int price=obj.nextInt(); // reads price user
            int quantity=obj.nextInt(); // reads quantity user
            products[i]=new Product_Q1_2(pid,price,quantity); // creating new Product object and store it in the array
        }
        // Initializing variables to find the product with the highest price
        int highestPrice=Integer.MIN_VALUE; // declare variable with small possible integer
        int highestPriceIndex=-1; // highest price product as -1
        //Loop to find  the index of the highest price product
        for (int i = 0; i < 5; i++) {
            if (highestPrice < products[i].price) { // checks if the current product has higher price
                highestPrice = products[i].price; // updates highest product price
                highestPriceIndex = i; // updates index of highest product price
            }
        }
        int costliestProduct=products[highestPriceIndex].pid; // gets the product id of product with the highest price
        System.out.println("Product with highest price: "+costliestProduct); // displays pid of product with the highest price
        System.out.println("Total amount spent: "+totalAmount(products)); // display total amount spent by calling total amount() method

    }
    // Method to calculate total amount spent on all products
    public static int totalAmount(Product_Q1_2[] products){

        int totalPrice=0; // Initialize total price to 0.
        // Loops through product array and calculates total price
        for(int i=0;i<5;i++){
            totalPrice += products[i].price*products[i].quantity; // add totalPrice with price * quantity for each product
        }
        return totalPrice; // returns total amount spent on all products
    }
}

