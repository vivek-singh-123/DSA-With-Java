package Backtracking;

public class PrintPossiblePermutations {
    public static void printPermutation(String str, String prem, int inx){
        if(str.isEmpty()){
            System.out.println(prem);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr, prem+currChar, inx+1);
        }
    }
    public static void main(String[] args) {

        String str="ABC";
        printPermutation(str, "", 0);
    }
}
