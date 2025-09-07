package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
    public static boolean isMorphic(String s, String t){
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> st = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i); //yha length must be same hai so, directly hm yese bhi t ke liye curr char nikal skte hai

            if(map.containsKey(sCh)){
                if(map.get(sCh) != tCh){
                    return false;
                }
            } else if (st.contains(tCh)) {
//               else if (map.containsValue(tCh)) //this will take T.C linear time in HashMap, bcz hm hash function me key pass krte hai,
//               value nhi(so isko one by one check krna pdega), that's why HashMap me contains.Value function linear time leta hai....
//               & inside HashSet will be constant time........
                return false;
            }else {
                map.put(sCh, tCh);
                st.add(tCh);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println( isMorphic("abcdbac", "xjsnjxs"));
        System.out.println( isMorphic("lfcdbac", "xjspjxs"));
    }

    //t.c is O(n)
    //s.c is O(n)
}
