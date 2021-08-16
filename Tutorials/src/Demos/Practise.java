package Demos;

public class Practise {
    public static void main(String[] args) throws Exception {


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                ;
            }
        }, "Hi Thread");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                ;
            }
        }, "Hello Thread");

        t1.start();
        System.out.println("Thread T1 is Running " + t1.isAlive());
        try {
            Thread.sleep(20);
        } catch (Exception e) {
        }
        ;
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println("Bye");
        System.out.println("Thread T1 is Running " + t1.isAlive());
    }
}
