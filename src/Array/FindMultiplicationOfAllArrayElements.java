package Array;

import java.util.Scanner;

public class FindMultiplicationOfAllArrayElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        int mul=1;
        for(int i=0; i<=arr.length-1; i++){
            mul=mul*arr[i];
        }
        System.out.println("Multiplication of all a array elements: "+mul);



    }
}
