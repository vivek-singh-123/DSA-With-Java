package Test1Practice;

public class ReverseANumber {
    public static void main(String[] args) {
        int num=1653;
        int reverse=0;

        while (num>0){
            int r=num%10;
            reverse=(reverse*10)+r;
            num=num/10;

        }
        System.out.println(reverse);
    }
}
