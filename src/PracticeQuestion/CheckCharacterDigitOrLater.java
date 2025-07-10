package PracticeQuestion;

public class CheckCharacterDigitOrLater {
    public static void main(String[] args) {
        String str="65v323549s";

        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
            //if(str.charAt(i)=='0' || str.charAt(i)=='1' || str.charAt(i)=='2' || str.charAt(i)=='3' || str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' || str.charAt(i)=='7' || str.charAt(i)=='8' || str.charAt(i)=='9'){
                System.out.println("Character is digit");
            }else {
                System.out.println("Character is alphabet");
            }
        }
    }
}
