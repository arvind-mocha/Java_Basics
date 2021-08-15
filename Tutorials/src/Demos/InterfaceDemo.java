package Demos;

// It is not Nessacary to use Abstract Keyword inside an interface
@FunctionalInterface // Interface with one abstract function is called as Function Interface
interface Air{

    int i = 8; // A variable inside a interface is a final variable ( Constant )
    void show();
    // The only way to call default methods is by inheriting this interface
    default void method(){
      System.out.println("We can have default methods in interface");
    };

    //We can also create static methods inside interface, where we don't need an object to call this method
    static void StaticMethod(){
        System.out.println("We can have Static methods in interface");
    }
}

interface Sea{
    void show();
    default  void method(){
        System.out.println("This is from sea");
    }
}

class Oxygen{
    public void show(){
        System.out.println("This is Oxygen");
    }
}

// We are Implementing two interface which has same function name as method which causes ambiquity error
// Since java does not know which method to execute
class Nitrogen extends Oxygen implements Air, Sea{
    public void show(){
        super.show();
        System.out.println("This is Nitrogen");
    }

    // This is how we can use super with interface and solve ambiquity error
    @Override
    public void method(){
        Sea.super.method();
        Air.super.method();
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Nitrogen obj = new Nitrogen();
        obj.show();
        obj.method();
        Air.StaticMethod();
    }
}
