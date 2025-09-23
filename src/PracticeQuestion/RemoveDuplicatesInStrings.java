package PracticeQuestion;


public class RemoveDuplicatesInStrings {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder sb=new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);

            if(sb.indexOf(String.valueOf(currChar)) == -1){
                sb.append(currChar);
            }
        }
        System.out.println(sb);

    }
}
