package task2.solution1_4;

public class Test_Q1_4 { // class with main method
    // Main method
    public static void main(String[] args) {
        // Creating the Employee object with name, age, employee ID, and salary.
        Employee_Q1_4 employee1=new Employee_Q1_4("Anto",22,10001,50000); // creates first Employee object
        Employee_Q1_4 employee2=new Employee_Q1_4("Newlin",18,10002,80000); // creates second Employee object
        // Display details of employee1
        System.out.println("EmployeeID: "+employee1.employeeID+" Name: "+employee1.name+" Age: "+employee1.age+" Salary: "+employee1.getSalary());
        // Display details of employee2
        System.out.println("EmployeeID: "+employee2.employeeID+" Name: "+employee2.name+" Age: "+employee2.age+" Salary: "+employee2.getSalary());
    }
}
