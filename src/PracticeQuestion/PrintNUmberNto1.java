package PracticeQuestion;

public class PrintNUmberNto1 {
    public static void main(String[] args) {
        int n = 10;

        printNum(n, 1);
    }
    public static void printNum(int n, int end){
        if(n < end){
            return;
        }

        System.out.print(n+" ");
        printNum(n-1, end);
    }
}
