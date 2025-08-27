package Recursion;

public class FindNoOfWaysInMatrix {
    //finding the number of ways to reach the bottom-right cell in an n × m matrix by only moving right or down
    public static void main(String[] args) {
        System.out.println(possibleWays(2,3));
    }

    public static int possibleWays(int n, int m){
        if(n==1 || m==1){
            return 1;
        }

        return possibleWays(n-1, m)+possibleWays(n,m-1);
    }
}
