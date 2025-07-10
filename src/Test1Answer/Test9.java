package Test1Answer;

public class Test9 extends Thread {       //runtime exception
    public void run() {
        System.out.println("Thread Running");
    }
    public static void main(String[] args) {
        Test9 t = new Test9();
        t.start();
        t.start();
    }
}
