package Trie;

public class Implementation {
    //Node class
    public static class Node{
        Node[] children;
        boolean eow;

        Node(){
            children=new Node[26];
            for(int i=0; i<26; i++){
                children[i]=null;
            }

            eow=false;
        }
    }

    //root
    static Node root=new Node();

    //insert
    static void insert(String word){
        Node curr=root;
        for(int i=0; i<word.length(); i++){  //T.C would be O(L)
            int idx = word.charAt(i)-'a';

            if(curr.children[idx] == null){
                curr.children[idx]=new Node();
            }

            curr=curr.children[idx];
        }

        curr.eow = true;
    }

    //search
    static boolean search(String key){
        Node curr=root;
        for(int i=0; i<key.length(); i++){
            int idx=key.charAt(i) - 'a';

            if(curr.children[idx] == null){
                return false;
            }

            curr=curr.children[idx];
        }
        return curr.eow;
    }

    //word break problem
    public static boolean wordBreak(String key){
        if(key.isEmpty()){
            return true;
        }

        for(int i=1; i<=key.length(); i++){
            String firstPart = key.substring(0,i);
            String secondPart = key.substring(i);

            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        String[] words={"this", "is", "a", "trie", "data", "structure"};

//        for(int i=0; i<words.length; i++){
//            insert(words[i]);
//        }

//        System.out.println(search("their"));
//        System.out.println(search("this"));
//        System.out.println(search("structure"));
//        System.out.println(search("an"));

        String[] words = {"i", "like", "sam", "samsung", "mobile"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        String key = "ilikesamsung";
        System.out.println(wordBreak(key));
    }
}
