package Recursion;

public class Print1ToNSum {
    public static void main(String[] args) {
        Print1ToNSum p=new Print1ToNSum();
        int result=p.sum(10);
        System.out.println(result);
    }
    int sum(int n){
        if(n<1){
            return 0;
        }
        return n+sum(n-1);
    }
}
