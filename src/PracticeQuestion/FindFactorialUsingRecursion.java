package PracticeQuestion;

public class FindFactorialUsingRecursion {
    public static void main(String[] args) {
        int n = 5;

        int result = calFactorial(n);
        System.out.println(result);
    }

    public static int calFactorial(int n){
        if(n < 1){
            return 1;
        }

        return n * calFactorial(n-1);
    }
}
