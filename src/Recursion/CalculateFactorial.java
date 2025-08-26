package Recursion;

public class CalculateFactorial {
    static int factorial=1;
    public static int CalFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        factorial=factorial*n;
        CalFactorial(n-1);

        return factorial;
    }

    public static void main(String[] args) {
        int n=5;

        int result= CalFactorial(n);
        System.out.println(result);
    }
}
