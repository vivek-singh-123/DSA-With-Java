package Test1Answer;

class Parent {
    void show() {
        System.out.println("Parent");
    }
}
class Child extends Parent {
    void show() {
        System.out.println("Child");
    }
}
public class Test3 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
