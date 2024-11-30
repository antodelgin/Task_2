package task2.solution1_1;

public class Person_Q1_1 {
    // private instance variables for storing name and age
    private String name;
    private int age=18; // default age is set to 18

    // Default constructor
    public Person_Q1_1(){

    }
    // Constructor with one parameter
    public Person_Q1_1(String name){
        this.name=name;  // assigns provided 'age' to the instance variable 'age'

    }
    // Constructor with two parameters
    public Person_Q1_1(String name, int age){
        this.name=name; // assigns provided 'name' to the instance variable 'name'
        this.age=age;  // assigns provided 'age' to the instance variable 'age'
    }
    // Method to display name and age
    public void display(){
        System.out.println("Name: "+name+" Age: "+age);
    }
}

