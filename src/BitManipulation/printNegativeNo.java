package BitManipulation;

public class printNegativeNo {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n);

        n = ~n;  //here we are getting 1's compliment   // 101  --> 010
        n = n+1;  //when we add 1 in 1's compliment then we all get 2's compliment //010 + 1
        System.out.println(n);
    }
}
