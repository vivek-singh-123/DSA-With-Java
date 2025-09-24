package PracticeQuestion;

//Convert a string to uppercase/lowercase without using built-in
public class ConvertAStringUpperLower {
    public static void main(String[] args) {
        String str = "abcXYZ";
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            if (currChar >= 'a' && currChar <= 'z') {
                currChar = (char)(currChar-32);
            } else if (currChar >= 'A' && currChar <= 'Z') {
                currChar = (char) (currChar+32);
            }

            sb.append(currChar);
        }

        System.out.println(sb);
        char c='a';
        System.out.println((int) c - 'A');
    }
}
