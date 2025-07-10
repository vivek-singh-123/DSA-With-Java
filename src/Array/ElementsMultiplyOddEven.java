package Array;

public class ElementsMultiplyOddEven {
    public static void main(String[] args) {
        int[] arr = {10,23,31,40,50,63,70,87,99,100};

        for(int i=0; i< arr.length; i++) {
            if(arr[i]%2==0){
                System.out.print(arr[i]*2+" ");
            }else
            {
                System.out.print(arr[i]*3+" ");
            }
        }
    }
}
