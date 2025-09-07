package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    static Map<Character,Integer> makeFreqMap(String str){
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else {
                int currFreq = map.get(ch);
                map.put(ch, currFreq+1);
            }
        }
        return map;
    }

               //approach 1
//    public static boolean isAnagram(String s, String t){
//        if(s.length() != t.length()){
//            return false;
//        }
//
//        Map<Character, Integer> mp1 = makeFreqMap(s);
//        Map<Character, Integer> mp2 = makeFreqMap(t);
//
//        return mp1.equals(mp2);
//    }

                     //approach 2
    public static boolean isAnagram2(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> mp = makeFreqMap(s);
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);

            if(!mp.containsKey(ch)){
                return false;
            }else {
                int currfreq = mp.get(ch);
                mp.put(ch, currfreq-1);
            }
        }

        //all values in mp should be 0 if s and t is anagram
        for(Integer val : mp.values()){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
//        System.out.println(isAnagram("listen", "silent"));
//        System.out.println(isAnagram("learn", "earn"));

        System.out.println(isAnagram2("listen", "silent"));
        System.out.println(isAnagram2("learn", "earn"));
    }
}
