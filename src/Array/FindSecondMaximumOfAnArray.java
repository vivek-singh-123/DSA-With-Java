package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondMaximumOfAnArray {
    public static void main(String[] args) {

        Scanner r=new Scanner(System.in);
        System.out.print("Enter size of elements: ");
        int size=r.nextInt();

        int[] num=new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++){
            num[i]=r.nextInt();
        }

        Arrays.sort(num);
        System.out.println("second maximum element: "+num[size-2]);

    }
}
