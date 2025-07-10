package Test1Practice;
class A{
        int a=10;
}
class B extends A{
  void  show(){
      int a=20;
      System.out.println(super.a);
      System.out.println(a);
  }
}
public class SuperKeyword {
    public static void main(String[] args) {
        B ref=new B();
        ref.show();
    }
}
