package Recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int terms=10;
        System.out.println("Fibonacci Series up to " + terms + " terms:");
        for (int i=0; i<terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    static int fibonacci(int n) {
//        if (n==0){
//            return 0;
//        }
//        if (n==1){
//            return 1;
//        }
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
