

public class practise {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a , int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
        practise practise= new practise();
        int sum1= practise.add(5, 7);
        System.out.println("The sum is : " +sum1);
        int sum2 = practise.add(5,7,8);
        System.out.println("The sum is :"+sum2);
        double sum3= practise.add(8.9, 7.8);
            System.out.println("The sum is : "+sum3);
        
    }
}
