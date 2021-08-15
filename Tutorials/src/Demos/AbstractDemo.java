package Demos;

// We cannot create objects for abstract classes directly
// we can inherit abstract class in another class and create object for the Sub class

abstract class Human {
    public abstract void walk(); // If we have atleast one abstract method then that class must be an abstract class

    public void eat() {
        System.out.println("I can eat");
    }
}

class Man extends Human {
    // If we are extending an abstract class we must use the abstract method else it s an error
    public void walk() {

    }

    // Number is an abstract wrapper class
    // Which Means we can pass int or float or double or short or long as a parameter no error will occur
    public void time(Number i) {
        System.out.println(i);
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Man obj = new Man();
        obj.time(1);
        obj.time(1.4f);
        obj.time(1.555);
    }
}
