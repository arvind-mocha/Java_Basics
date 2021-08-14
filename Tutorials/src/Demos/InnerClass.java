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

    static class InnerStatic {
        public void display() {
            System.out.println("Print From Inner Static Class");
        }
    }
}

    public class InnerClass {
        public static void main(String[] args) {
            Outer obj = new Outer();
            obj.show();

            Outer.Inner obj1 = obj.new Inner();
            obj1.display();

            // For static class We don't need a object
            Outer.InnerStatic obj2 = new Outer.InnerStatic();
            obj2.display();
        }
    }
