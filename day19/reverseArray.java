

public class reverseArray {
    int first=0,last=numbers.length-1;
    while(first<last){
        int temp =numbers[last];
        numbers[last]=numbers[first];
        numbers[first]=temp;
        first++;
        last--;
    }
}
    public static void main(String[] args) {
        int numbers[]={2,5,4,6,7,9,4,1};

    }

