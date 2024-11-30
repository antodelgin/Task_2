package task2.solution1_4;

public class Employee_Q1_4 extends Person_Q1_4 {
    public int employeeID;  // Employee ID as public
    private int salary;    // Salary of the employee as private
    // Default constructor
    public Employee_Q1_4(){

    }
    //Parameterized constructor
    public Employee_Q1_4(String name, int age, int employeeID, int salary){
        super(name,age); // calls the constructor of the superclass to initialize name and age
        this.employeeID=employeeID; // assigns the provided employeeID to the 'employeeID' instance variable
        this.salary=salary; // assigns the provided salary to the 'salary' instance variable
    }
    // Getter method to access private salary variable
    public int getSalary(){
        return salary;
    }
    // Setter method to update the private salary variable
    public void setSalary(int salary){
        this.salary=salary;
    }
}

