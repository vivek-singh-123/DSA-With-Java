package Array;


import java.util.Arrays;

public class ReverseString344 {
    public static void main(String[] args) {
        String[] str={"apple", "b", "c", "d", "e", "f"};

        int len=str.length;
        int i=0;
        int j=len-1;
        while(i<j){
            String  temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(str));
    }
}

