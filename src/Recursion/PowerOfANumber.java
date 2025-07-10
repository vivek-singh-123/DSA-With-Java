package Recursion;

import java.util.Scanner;

public class PowerOfANumber {        //without Math.pow();
    public static void main(String[] args) {
        //System.out.println(Math.pow(2,3));

        int power;
        System.out.println("enter power number:");
        Scanner obj=new Scanner(System.in);
        power=obj.nextInt();
        int base=2;
        int result=base*power;
        System.out.println(result);

    }
}
