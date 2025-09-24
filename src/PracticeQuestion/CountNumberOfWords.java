package PracticeQuestion;

//Count the number of words in a string
public class CountNumberOfWords {
    public static void main(String[] args) {
        String str = "I love java";

        int words = str.split(" ").length;      // str.split => Takes string and breaks it into an
                                                      // array internally wherever it finds a space " ".
        System.out.println(words);
    }
}
