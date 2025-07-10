//Take a matrix as input from the user.
// Search for a given number x and print the indices at which it occurs.
package Array;

import java.util.Scanner;

public class TwoDArraysExample {
    public static void main(String[] args) {
        System.out.print("Enter number which you want print 2D array as rows & columns: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];

        //input
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
              numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number which you want to find: ");
        int x = sc.nextInt();

        //
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(numbers[i][j] == x) {
                    System.out.print("x found at index: "+ i + ":"+ j);
                }
            }
            System.out.println();
        }
    }
}
