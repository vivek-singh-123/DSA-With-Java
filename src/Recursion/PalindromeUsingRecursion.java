package Recursion;

public class PalindromeUsingRecursion {
    public static void main(String[] args) {
        int num=121;
        int orgNum=num;
        int store=0;
        store=palindrome(num, store);
        if(orgNum==store){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
    static  int palindrome(int num, int store){
        if(num==0){
            return store;
        }
            int r=num%10;
            store=(store*10)+r;
            num=num/10;
            return palindrome(num, store);
    }

}
