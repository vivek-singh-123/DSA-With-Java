package Test1Practice;

public class ReverseAString {
    public static void main(String[] args) {
        String str="vivek singh";
        int len=str.length();
        for(int i=len-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
