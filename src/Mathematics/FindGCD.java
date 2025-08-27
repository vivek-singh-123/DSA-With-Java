package Mathematics;

public class FindGCD {
    public static void main(String[] args) {

        System.out.println(gcd(12, 45));
    }

    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }

        return gcd(b, a%b);
    }
}
