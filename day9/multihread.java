package day9;

public class multihread {
    public static void main(String[] args) {
        // Create threads
        Thread thread1 = new Thread(() -> System.out.println("Thread 1 running"));
        Thread thread2 = new Thread(() -> System.out.println("Thread 2 running"));

        // Start threads
        thread1.start();
        thread2.start();
    }
    
}
