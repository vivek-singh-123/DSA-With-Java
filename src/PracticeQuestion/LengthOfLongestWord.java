package PracticeQuestion;

// Find the length of the longest word in a sentence
public class LengthOfLongestWord {
    public static void main(String[] args) {
        String sentence = "I love programming";
        String[] words = sentence.split(" ");
        int maxLength = 0;

        for(String word : words){
            if(word.length() > maxLength){
                maxLength = word.length();
            }
        }

        System.out.println("length of the longest word: "+maxLength);
    }
}
