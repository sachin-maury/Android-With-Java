public class multithreadiMultithreadingng {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Thread 1: Running!")).start();
        new Thread(() -> System.out.println("Thread 2: Running!")).start();
    }
}
