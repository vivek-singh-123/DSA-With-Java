package Recursion;

public class FindGCDOfTwoNumber {
    public static void main(String[] args) {
        int num1 = 60;
        int num2 = 20;
        int gcd = 0;
        int i = 1;

        int result = GCDFind(num1, num2, gcd, i);
        System.out.println(result);
    }

    static int GCDFind(int num1, int num2, int gcd, int i) {

        if (i > num1) {
            return gcd;
        }
        if (num1 % i == 0 && num2 % i == 0) {
            gcd = i;
        }
        return GCDFind(num1, num2, gcd, i + 1);
    }
}
