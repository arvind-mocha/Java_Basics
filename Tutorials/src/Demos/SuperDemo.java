package Demos;

class A{
    public A() {
        System.out.println("in A");
    }

    public A(int a){
        System.out.println("in A with parameter");
    }
}

class B extends A{
    // by default super() will be called in all sub class
    public B() {
        System.out.println("in B");
    }

    public B(int b){
        // Overriding the default super() with passing parameters
        super(4);
        System.out.println("in B with parameter");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        B obj = new B(1);
    }
}
