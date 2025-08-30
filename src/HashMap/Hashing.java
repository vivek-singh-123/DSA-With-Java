package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();

        //insertion
        map.put("India", 91);
        map.put("US", 1);
        map.put("China", 86);
        map.put("Russia", 7);

        //print
        System.out.println(map);

        map.put("China", 10);  //if key is exist then it will update otherwise insert
        System.out.println(map);

        //search
//        if(map.containsKey("China")){
//            System.out.println("Key is present in map");
//        } else {
//            System.out.println("Key is not present in map");
//        }

//        System.out.println(map.get("China")); //key exist in map
//        System.out.println(map.get("France")); //key doesn't exist in map

        //Iteration through entrySet
//        for(Map.Entry<String, Integer> val : map.entrySet()){
//            System.out.println(val.getKey());
//            System.out.println(val.getValue());
//        }

        //Iteration through keySet
//        Set<String> keys=map.keySet();
//        for(String key : keys){
//            System.out.println(key+" "+map.get(key));
//        }


        //remove
        map.remove("China");
        System.out.println(map);

    }
}
