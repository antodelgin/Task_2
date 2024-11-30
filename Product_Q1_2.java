package task2.solution1_2;

public class Product_Q1_2 {
    // public instance variable for storing pid, price and quantity
    public int pid; // Product ID
    public int price;
    public int quantity;
    // Default constructor
    public Product_Q1_2() {

    }
    // Constructor with three parameters
    public Product_Q1_2(int pid, int price, int quantity) {
        this.pid=pid; // assigns provided 'pid' to the instance variable 'pid'
        this.price=price; // assigns provided 'price' to the instance variable 'price'
        this.quantity=quantity; // assigns provided 'quantity' to the instance variable 'quantity'
    }
}

