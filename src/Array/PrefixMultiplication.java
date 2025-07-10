package Array;

import java.util.Arrays;

public class PrefixMultiplication {
    public static void main(String[] args) {
        int[] numbers={5,10,46,65,15,3,53,30};
        int len=numbers.length;
        int[] premul=new int[len];
        premul[0]=numbers[0];
        for(int i=1; i<len; i++){
            premul[i]=premul[i-1]*numbers[i];
        }
        System.out.println(Arrays.toString(premul));
    }
}
