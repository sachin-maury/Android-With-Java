
import java.util.Scanner;
public class practice3 {
    // Source code is decompiled from a .class file using FernFlower decompiler.



   public practrice3() {
   }

   public static int printNumber(int var0, int var1) {
      int var2 = var0 + var1;
      return var2;
   }
///
   public static void main(String[] var0) {
      System.out.println("Enter your number : ");
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      int var4 = printNumber(var2, var3);
      System.out.println("The sum is : " + var4);
   }
}


