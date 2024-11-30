package task2.solution1_1;


public class TestPerson_Q1_1 { // class that contains main method
    //Main method
    public static void main(String[] args) {

        // Creating an object of the Person class using parameterized constructor with two arguments.
        Person_Q1_1 anto=new Person_Q1_1("Anto",22);
        // Creating an object of the Person class using parameterized constructor with one argument.
        Person_Q1_1 newlin=new Person_Q1_1("Newlin");
        anto.display(); // calling display method for object 'anto'
        newlin.display(); // calling display method for object 'newlin'
    }
}

