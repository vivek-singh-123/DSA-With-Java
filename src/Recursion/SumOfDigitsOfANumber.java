package Recursion;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {

        int num = 751025;
        int sum = 0;
        int result = sumOfDigit(num, sum);
        System.out.println(result);
    }

    static int sumOfDigit(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        int r = num % 10;
        sum = sum + r;
        num = num / 10;
        return sumOfDigit(num, sum);
    }
}
