package Test1Practice;

public class ThisKeyword {
        ThisKeyword(){
            System.out.println("hay, my name is vivek singh");
        }
        ThisKeyword(int num){
            this();
            System.out.println(num);
        }

    public static void main(String[] args) {
        ThisKeyword tk=new ThisKeyword(100);
    }
}
