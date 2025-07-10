package Recursion;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "tom and jerry cartoon!";
        int len = str.length();
        int i = len - 1;
        String an = reverseString(str, i);
        System.out.println(an);

    }

    static String reverseString(String str, int i) {
        if (i < 0) {
            return "";
        }
        return str.charAt(i) + reverseString(str, i - 1);
    }
}

// int j = len - 1;
// String temp = "";

//        String another = str.concat("r");
//        System.out.println(another);
//        String another2 = str.replace("k", "r");
//        System.out.println(another2);
//        String an3 = str.replaceFirst("k", "r");
//        System.out.println(an3);

//char[] test = str.toCharArray();  //whenever we need to swap string then first convert into char array
// then work on them and last one again convert into string

//String result = new String(test);