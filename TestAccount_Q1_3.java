package task2.Solution1_3;

public class TestAccount_Q1_3 { // class with main method
    // Main method
    public static void main(String[] args) {
        // Creating an Account object acc1 with accountHolder's name and initial balance of 30000
        Account_Q1_3 acc1=new Account_Q1_3("anto",30000);
        acc1.deposit(1000); // deposits 1000
        acc1.withdraw(20000); // withdraws 20000
        System.out.println(acc1.getBalance()); // displays balance
        // Creating an Account object acc2 with accountHolder's name and initial balance of 30000
        Account_Q1_3 acc2=new Account_Q1_3("denil",50000);
        acc2.deposit(3456); // deposits 3456
        acc2.withdraw(500); // withdraws 500
        System.out.println(acc2.getBalance()); //displays balance
    }
}
