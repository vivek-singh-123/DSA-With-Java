package Test1Answer;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}
public class Test8 {
    public static void main(String[] args) {
        Person p1 = new Person("John");
        Person p2 = new Person("John");
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        System.out.println(p1.name.equals(p2.name));
    }
}
