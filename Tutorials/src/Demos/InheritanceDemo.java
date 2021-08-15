package Demos;

class Automobiles{

    String color = "Red";
    public void Truck(){
        System.out.println("This is a Truck");
    }

    public void Cars(){
        System.out.println("This is a Car");
    }

    public void Bike(){
        System.out.println("This is a Bike");
    }
}

class parts extends Automobiles{
    public void Tires(){
        System.out.println("Tires Changed");
    }

    public void Stickers(){
        System.out.println("Stickers of color " + color +  " installed");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        parts Tesla = new parts();
        Tesla.Cars();
        Tesla.Stickers();
    }
}
