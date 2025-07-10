package Test1Practice;

public class CheckPalindromePossibility {
    public static void main(String[] args) {
        int[] arr={2, 3, 1, 3, 5, 2};
        int len=arr.length;
        for (int i=0; i<len/2; i++){
                if(arr[i]!=arr[len-1-i]){
                    System.out.println("not palindrome array!");
                    return;
                }
        }
        System.out.println("palindrome");
    }
}
