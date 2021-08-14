package Demos;

class Emp{
    int salary;
    int age;
    static String ceo; // Now the variable is not object specific. if it's value changes it changes for all object

    // Using static block we can initialize multiple values for static variables which is already been declared
    static {
        ceo = "Mathi";
    }

    public void show() {
        System.out.println(salary + " : " + age + " : " + ceo);
    }
}


public class StaticDemo {
    public static void main(String[] args) {
        Emp Arvind = new Emp();
        Emp chandru = new Emp();

        Arvind.salary = 300000;
        Arvind.age = 20;

        chandru.salary = 100000;
        chandru.age = 20;

        // Emp.ceo = "Mathi"; // since it is a static variable it can be referenced by the class itself. we don't need a object

        Arvind.show();
        chandru.show();
    }
}
