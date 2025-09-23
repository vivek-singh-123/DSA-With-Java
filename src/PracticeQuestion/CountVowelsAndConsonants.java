package PracticeQuestion;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "there";
        int vcounter = 0;
        int ccounter = 0;

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            if(currChar == 'a' || currChar == 'e' || currChar == 'i' || currChar == 'o' || currChar == 'u'){
                vcounter++;
            }else {
                ccounter++;
            }
        }

        System.out.println("vowels: "+vcounter+" consonants: "+ccounter);
    }
}
