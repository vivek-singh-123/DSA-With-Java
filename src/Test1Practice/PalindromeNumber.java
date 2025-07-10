package Test1Practice;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number=121;
        int orgNum=number;
        int reverse=0;
        while (number>0){
            int r=number%10;
            reverse=(reverse*10)+r;
            number=number/10;
        }

        if(orgNum==reverse){
            System.out.println("palindrome!");
        }else {
            System.out.println("not palindrome");
        }
    }
}
