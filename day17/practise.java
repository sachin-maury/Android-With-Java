import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        System.out.println("Enter your number :");
     Scanner sc = new Scanner(System.in);

    
    int num =sc.nextInt();
    if(num % 2==0){
        System.out.println("This is a even number :" +num);

    }
    else{
        System.out.println("This is a odd number :" +num);
    }
}
}
