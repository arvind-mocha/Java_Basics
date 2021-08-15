package Demos;

//Thread using Thread class
//Threads Using Runnable Interface

public class ThreadsDemo {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
                ;
            }
        }, "Hi Thread"); // One Way of giving Name to our Thread

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello " + Thread.currentThread().getPriority()); // Can access the Current Running Thread
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
                ;
            }
        }, "Hello Thread");

        // We can change the priority of out Threads
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Thread t1 Priority " + t1.getPriority());
        System.out.println("Thread t2 Priority " + t2.getPriority());

        t1.start();
        // Detects weather our Thread is running or Not
        System.out.println("T1 Thread is running " + t1.isAlive());
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        ;
        t2.start();

        // Joins make the Main Thread Wait Until The execution of out function
        t1.join();
        t2.join();

        // Runs Only after our Both Thread Stops their Execution
        System.out.println("Bye");
        // Detects weather our Thread is running or Not
        System.out.println("T1 Thread is Running " + t1.isAlive());

        // Another way of Giving Name for our threads
        t1.setName("Hi Thread");
        t2.setName("Hello Thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());




    }
}
