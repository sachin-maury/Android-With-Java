

public class overloading {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;

    }
    public double add(double a, double b){
        return a+b;
    }
    public static void main(String [] args){
        overloading obj = new overloading();
        int sum1= obj.add(5, 7);
        System.out.println("The sum is " +sum1);
        int sum2 = obj.add(8, 8);
        System.out.println("The sum is "+sum2);
        double sum3 = obj.add(7, 9);
        System.out.println("The sum is "+ sum3);
    }
}
