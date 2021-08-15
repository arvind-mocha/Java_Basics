package Demos;

abstract class Writer{
    public abstract void writer();
}

class Pen extends Writer{
    public void writer(){
        System.out.println("From Pen");
    }
}

class Pencil extends Writer{
    public void writer(){
        System.out.println("From Pencil");
    }
}

class Kit{
    public void DoSomeThing(Writer P){
        P.writer();
    }
}


public class DynamicMethodDemo {
    public static void main(String[] args) {

        // We can refer the base class and create object for sub class
        // This will prevent method overrideing and uses the method which belongs to that paticular object alone
        Kit k = new Kit();

        Writer obj = new Pen();
        Writer obj1 = new Pencil();

        k.DoSomeThing(obj);
        k.DoSomeThing(obj1);
    }
}
