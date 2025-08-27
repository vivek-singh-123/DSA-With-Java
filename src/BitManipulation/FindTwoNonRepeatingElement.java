package BitManipulation;

public class FindTwoNonRepeatingElement {
    //find the two non-repeating element in an array where every element repeats twice.
    public static void main(String[] args) {
        int[] arr = {5,4,1,4,3,5,1,2};
        int res=0;

        for(int i=0; i< arr.length; i++){
            res=res^arr[i];
        }

        int rightmostSetBit = res & -res;

        int a = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & rightmostSetBit) == 0) {
                a = a ^ arr[i];
            } else {
                b = b ^ arr[i];
            }
        }

        System.out.println(a + " " + b);
    }
}
