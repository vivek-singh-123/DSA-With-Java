package Array;

import java.util.Scanner;

public class PrintMatrix2DArray {
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        System.out.println("Enter number: ");
        Scanner obj=new Scanner(System.in);

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                arr[i][j]=obj.nextInt();
            }
        }
        System.out.println("Matrix is:");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
