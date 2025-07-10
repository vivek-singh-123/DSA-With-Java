package Recursion;

public class CountZerosInANumber {
    public static void main(String[] args) {
        int num = 90064085;
        int counter = 0;
        String numstr = String.valueOf(num);
        int i = 0;
        int result = countzero(numstr, i, counter);
        System.out.println(result);

    }

    static int countzero(String numstr, int i, int counter) {
        if (i >= numstr.length()) {
            return counter;
        }
        if (numstr.charAt(i) == '0'){
            counter+=1;
        }

            return countzero(numstr, i+1, counter);

    }
}
