package task2.Solution1_3;

public class Account_Q1_3 {
    // Data members to store the accountHolder's name and balance
    private String accountHolder;
    private double balance;
    // Default constructor
    public Account_Q1_3(){

    }
    // Parameterized constructor with two parameters
    public Account_Q1_3(String accountHolder, double initialBalance){
        this.balance=initialBalance;
        this.accountHolder=accountHolder;
    }
    // Method to deposit amount
    public void deposit(double amount) {
        balance+=amount;
    }
    // Method to withdraw amount
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){ // checks whether amount in account is greater than or equal to withdrawal amount
            balance-=amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }
    // Method to display balance
    public String getBalance(){
        return "Name: "+accountHolder +" Balance: " + balance;
    }
}
