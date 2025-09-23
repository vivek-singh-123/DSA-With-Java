package PracticeQuestion;

import java.util.HashMap;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String str = "racecar";
        HashMap<Character, Integer> map=new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            if(map.containsKey(currChar)){
                map.put(currChar,map.get(currChar)+1);
            } else {
                map.put(currChar, 1);
            }
        }

        System.out.println(map);
    }
}
