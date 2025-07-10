package Recursion;

public class Factorial {
    public static void main(String[] args) {
        Factorial f=new Factorial();
        int result=f.factorial(5);
        System.out.println(result);
    }
    int factorial(int num){
        if(num==0){
            return 1;
        }
            return  num*factorial(num-1);
    }
}
