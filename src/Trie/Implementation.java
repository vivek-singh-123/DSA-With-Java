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
        for(int i=0; i<word.length(); i++){  //T.C would be O(L)
            int idx = word.charAt(i)-'a';

            if(root.children[idx] == null){
                root.children[idx]=new Node();
            }

            if(i == word.length()-1){
                root.children[idx].eow=true;
            }

            root=root.children[idx];
        }
    }

    //search

    public static void main(String[] args) {
        String[] words={"this", "is", "a", "trie", "data", "structure"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
    }
}
