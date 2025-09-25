package PracticeQuestion;

//Find nth Fibonacci number using recursion
public class FindFibonacciNumber {
    public static void main(String[] args) {
        int n = 10;

        int result = findFibonacci(n);
        System.out.println(result);
    }

    public static int findFibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return findFibonacci(n-1) + findFibonacci(n-2);
    }
}
