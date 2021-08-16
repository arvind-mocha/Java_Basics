package Demos;

class counter {
    int count;
    int count1;

    // Normal Methods are not Thread Safe, Many Thread Can access the method at same time and can be crashed
    public void increment() {
        count++;
    }

    // Synchronized Method is Thread safe, Only one thread can access at a time
    public synchronized void increment1() {
        count1++;
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) throws Exception {
        counter obj1 = new counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                obj1.increment();
                obj1.increment1();
            }
        });


        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                obj1.increment();
                obj1.increment1();

            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Normal Method "+obj1.count);
        System.out.println("Synchronized Method "+obj1.count1);
    }
}
