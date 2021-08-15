package Demos;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer");
        int n = sc.nextInt();
        System.out.println(n);
        System.out.println("Enter a String");
        String s = sc.next();
        System.out.println(s);

    }
}
