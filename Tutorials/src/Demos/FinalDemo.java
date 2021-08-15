package Demos;

// final classes cannot be inherited
final class constant{
    // final variable cannot be modified, It becomes a Demos.constant variable
    final double PI = 3.14;

//    public void change(){
//        PI = 1;
//    }

    // final method cannot be overrided
    public final void show(){

    }
}

//class anotherclass extends Demos.constant{
//    @Override
//    public void show(){
//
//    }
//}

public class FinalDemo {
    public static void main(String[] args) {
        constant obj = new constant();
    }
}
