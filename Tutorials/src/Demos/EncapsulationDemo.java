package Demos;

// Binding Variables with Methods is called as Encapsulation

class Student{
    private String Name;
    private int Age;

    public void SetName(String Name){
        this.Name = Name;
    }
    public String GetName(){
        return Name;
    }
    public void SetAge(int Age){
        this.Age = Age;
    }
    public int GetAge(){
        return Age;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.SetName("Mani");
        obj.SetAge(21);
        System.out.println(obj.GetAge());
        System.out.println(obj.GetName());
    }
}
