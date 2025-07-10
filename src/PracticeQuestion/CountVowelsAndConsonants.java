package PracticeQuestion;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str;
        System.out.print("enter string: ");
        Scanner s=new Scanner(System.in);
        str=s.nextLine();

        int vowel=0, consonent=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                vowel++;
            }else {
                consonent++;
            }
        }
        System.out.println("total vowel: "+vowel);
        System.out.println("total constant: "+consonent);
    }
}
