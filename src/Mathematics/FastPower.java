package Mathematics;

public class FastPower {
    public static void main(String[] args) {

        System.out.println(fastP(223265655, 4, 1000000007));
    }

    public static long fastP(int a, int b, int n){
        long res=1;

        while(b>0){
            if((b&1) != 0){
                res=(res*a%n)%n;
            }

            a=(a % n * a % n)%n;
            b=b>>1;
        }

        return res;
    }
}
