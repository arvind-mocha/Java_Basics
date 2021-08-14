package Demos;

class Outer {
    int a;

    public void show() {
        System.out.println
                ("From Show");
    }

    class Inner {
        public void display() {
            System.out.println("Print From Inner");
        }
    }

}

public class InnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
    }
}
