package Recursion;

public class PrintNaturalNumber1ToN {

    public static void main(String[] args) {
        print(1,10);
    }

    public static void print(int cur , int n){
        //base case--> base condition
        if(cur > n){
            return;
        }

        //accesing the data -> operations on data
        System.out.println(cur);

        //recursive calls with modified parameters
        print(cur+1 , n);
    }
}