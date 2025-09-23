package PracticeQuestion;

import java.util.HashMap;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        HashMap<Character, Integer> map=new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            if(map.containsKey(currChar)){
                map.put(currChar, map.get(currChar)+1);
            }else {
                map.put(currChar, 1);
            }
        }

       for(int i=0; i<str.length(); i++){
           if(map.get(str.charAt(i)) == 1){
               System.out.println("first non-repeating char: "+str.charAt(i));
               break;
           }
       }
    }
}
