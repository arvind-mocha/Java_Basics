package Demos;

public class WrapperDemo {
    public static void main(String[] args) {
        int i = 5; // Primitive Datatype

        Integer ii = new Integer(5); // Integer Class

        int k = ii.intValue(); // This is how we can get values from a Wrapper Class

        System.out.println(k);

        String s = "123";

        System.out.println(Integer.parseInt(s)); // One of the use of Wrapper Classes
    }
}
