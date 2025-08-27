package Mathematics;

import java.util.Arrays;

public class SeiveOfEratoSthenes {
    public static void main(String[] args) {

        boolean[] result = seiveOfE(20);
        for(int i=0; i<=20; i++){
            System.out.print(i+" "+result[i]);
        }
    }

    public static boolean[] seiveOfE(int n){
        boolean[] isPrime=new boolean[n+1];

        Arrays.fill(isPrime, true);

        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2; i*i<=n; i++){
            for (int j=2*i; j<=n; j=j+i){
                isPrime[j]=false;
            }
        }
        return isPrime;
    }
}
