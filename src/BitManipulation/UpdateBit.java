package BitManipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        System.out.print("Enter bit 0 or 1 which you want to update: ");
        Scanner sc=new Scanner(System.in);
        int operation=sc.nextInt();

        int n=5;  //0101
        int pos=1;
        int bitMask=1<<pos;

        if(operation==1){
            int newNumber=bitMask | n;
            System.out.println(newNumber);
        }else {
            int notBitMask=~(bitMask);
            int newNumber=notBitMask & n;
            System.out.println(newNumber);
        }
    }
}
