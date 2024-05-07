public class practice {

    public static void main(String[] args) {
        int a[] = {78,46,12,74,69,45};
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                System.out.println("This  number is even : " +a[i]);
            }
            else{
                System.out.println("This number is odd : "+a[i]);
            }
        }
    }
}