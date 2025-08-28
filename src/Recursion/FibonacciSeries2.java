package Recursion;

public class FibonacciSeries2 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n=10;
        CalFibo(n-2,a,b);
    }

    public static void CalFibo(int n, int a, int b){
        if(n == 0){
            return;
        }

        int sum = a+b;
        System.out.print(sum+" ");
        CalFibo(n-1, b, sum);
    }
}
