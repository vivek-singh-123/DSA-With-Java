//Take an array as input from the user.
// Search for a given number x and print the index at which it occurs.

package Array;

import java.util.Scanner;

public class OneDArrays {

    public static void main(String[] args) {

        System.out.print("Enter number of size which you want print: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        //for input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Now enter number which you want found: ");
        int x = sc.nextInt();

        //for output
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.println("x is founded at index "+ i);
            }
        }
    }
}
