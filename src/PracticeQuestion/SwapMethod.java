package PracticeQuestion;

public class SwapMethod {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        swap(a,b); // Java passes a copy of the value, not the original variable, so a & b in main remain unchanged
        System.out.print("a = " + a+" b = " + b);
        //System.out.print(“b = “ + b); // “”  ==> this is smart(curly) quotes, that's why getting compile error

    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
       // System.out.print("a = " + a+" b = " + b); //it will print first as campare to in main method
    }

}
