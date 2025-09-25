package PracticeQuestion;

//Print 1,2,…,n using recursion.
public class PrintNumber1toN {
    public static void main(String[] args) {
        int n = 20;
        printNum(1, n);
    }

    public static void printNum(int start, int n){
        if(start > n){
            return;
        }
        System.out.print(start+" ");
        printNum(start+1, n);
    }
}
