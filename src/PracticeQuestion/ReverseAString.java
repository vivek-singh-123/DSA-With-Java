package PracticeQuestion;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb=new StringBuilder();

        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }

        System.out.println(sb);
    }
}
