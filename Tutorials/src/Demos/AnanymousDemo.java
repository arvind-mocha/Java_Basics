package Demos;

class AAA {
    public void show() {

    }
}
@FunctionalInterface // Interface with only one abstract method
interface BBB {
    void show();
    default void newMethod(){
        System.out.println("We can have a method inside Interface");
    }
}

public class AnanymousDemo {
    public static void main(String[] args) {
        AAA obj = new AAA() {
            public void show() {
                System.out.println("Ananymous Class Using Class");
            }
        };

        obj.show();

        BBB obj1 = new BBB() {
            public void show() {
                System.out.println("Ananymous Class Using Interface");
            }
        };

        obj1.show();

        BBB obj2 = () -> System.out.print("Ananymous Class Using Interface through Lambda"); // only possible using functional interface

        obj2.show();
    }
}
