class PrintNumbers implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try { Thread.sleep(1000); } 
catch (InterruptedException e)
 { 
e.printStackTrace(); }
            System.out.println("Number: " + i);
        } } }
class PrintLetters implements Runnable {
    public void run() {
        for (char letter = 'A'; letter <= 'J'; letter++) {
            try { Thread.sleep(1500); } 
            catch (InterruptedException e) 
            { e.printStackTrace(); }
            System.out.println("Letter: " + letter);
        } } }
public class MultiThreadRunnableExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintNumbers());
        Thread thread2 = new Thread(new PrintLetters()) ;
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Both threads have finished execution.");
    }
}
