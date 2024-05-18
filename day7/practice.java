import java.util.Scanner;

public class practice {
    public static int printNumber(int a , int b){
        int mul =a*b;
        return mul;
    }
  public static void main(String[] args) {
    System.out.println("Enter your Number  : ");
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int mul = printNumber(a, b);
    System.out.println("The multiply is :  " +mul);
   
   
  }
}
