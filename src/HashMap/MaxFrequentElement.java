package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequentElement {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 1, 4, 5, 2, 1, 4, 3, 2, 1, 8};

        Map<Integer, Integer> freq=new HashMap<>();

//        for(int el: arr){
//            if(!freq.containsKey(el)){
//                freq.put(el, 1);
//            }
//            else {
//                freq.put(el, freq.get(el)+1);
//            }
//        }

        for(int el: arr){
            freq.put(el,freq.getOrDefault(el, 0)+1);
        }


        int maxFreq=0; int ansKey=-1;

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq=entry.getValue();
                ansKey=entry.getKey();
            }
        }

//        for(var key : freq.keySet()){
//            if(freq.get(key) > maxFreq){
//                maxFreq = freq.get(key);
//                ansKey = key;
//            }
//        }

        System.out.println(ansKey+" have max frequency and it occurs " + maxFreq + " times");
    }
}
