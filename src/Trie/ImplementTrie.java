package Trie;

public class ImplementTrie {
    public static class Node{
        Node children[];
        boolean eod;

        Node(){
            children =new Node[26];
            for(int i=0; i<26; i++){
                children[i] = null;
            }

            eod = false;
        }
    }
    static Node root=new Node();

    public static void insert(String word){
        Node curr = root;

        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx]= new Node();
            }

            curr = curr.children[idx];
        }

        curr.eod = true;
    }

    public static boolean search(String key){
        Node curr = root;

        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }


        return curr.eod;
    }


                        //word break problem
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=1; i<=key.length(); i++){
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);
            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }

                        //Check if a prefix exists in Trie (startsWith)
    public static boolean startsWith(String prefix){
        Node curr = root;

        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

                        //for count unique substrings
    public static int countNode(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null){
                count += countNode(root.children[i]);
            }
        }

        return count+1;
    }

                        //for largest word with all prefix
    public static String ans = "";
    public static String largestWord(Node root, StringBuilder temp){
        Node curr = root;
        if(curr == null){
            return null;
        }

        for(int i=0; i<26; i++){
            if(curr.children[i] != null && curr.children[i].eod == true){
                temp.append((char) (i + 'a'));
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }

                largestWord(curr.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        String words[] = {"apple", "stock", "an", "mobile", "sun"};
//        for(int i=0; i< words.length; i++){
//            insert(words[i]);
//        }
//
//        System.out.println(search("stock"));
//        insert("vivek");
//        insert("iphone");
//
//        System.out.println(search("vivek"));
//        System.out.println(search("samsung"));


             //for word break problem
//        String[] words = {"i", "like", "sam", "samsung", "mobile"};
//        for(int i=0; i< words.length; i++){
//            insert(words[i]);
//        }
//        String key = "ilikesamsung";
//
//        System.out.println(wordBreak(key));


            //for Check if a prefix exists in Trie (startsWith)
//        String[] words = {"apple", "app", "mango", "man", "woman"};
//        for(int i=0; i<words.length; i++){
//            insert(words[i]);
//        }
//        String prefix = "man";
//        System.out.println(startsWith(prefix));


            //for count unique substrings
//        String str = "apple";
//        for(int i=0; i<str.length(); i++){
//            String suffix = str.substring(i);
//            insert(suffix);
//        }
//
//        System.out.println(countNode(root));


        //for largest word with all prefix
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        largestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
