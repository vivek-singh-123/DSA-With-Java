package Test1Answer;

public class Test4 {
    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance Block");
    }
    public Test4() {
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        new Test4();
    }
}
