package Recursion;

public class CountDigitInANumber {
    public static void main(String[] args) {
        int num = 9006485;
        int counter = 0;
        int result = countzero(num, counter);
        System.out.println(result);

    }

    static int countzero(int num, int counter) {
        if (num == 0) {
            return counter;
        }
        num = num / 10;
        return countzero(num, counter + 1);
    }
}
