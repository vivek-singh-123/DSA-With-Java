package StringDS;

public class Strings {
    public static void main(String[] args) {

                            //Strings

        String firstName = "vivek";                                     //String: Strings in Java are Immutable
        String lastName = "singh";

        String fullName = firstName + " " + lastName;
//        System.out.println(fullName);
//        System.out.println("length: " + fullName.length());

        //print character
//        for (int i=0; i<fullName.length(); i++){
//            System.out.println(fullName.charAt(i));
//        }

        String str1 = "Tony";
        String str2 = "tony";

        // str1 > str2 : +ve value
        // str1 == str2 : 0
        // str1 < str3 : -ve value

        // ex: hello > cello
        // ex: aahell < aavello

        //compare
//        if (str1.compareTo(str2) == 0){
//            System.out.println("equal");
//        } else {
//            System.out.println("not equal!");
//        }

        //compare
//        if (str1.compareToIgnoreCase(str2) == 0){
//            System.out.println("equal");
//        } else {
//            System.out.println("not equal!");
//        }

        //compare
//        if (str1 == str2){
//            System.out.println("equal");
//        } else {
//            System.out.println("not equal!");
//        }


//        String sentence = "My name is Tonny Stark";
//        String result = sentence.substring(11, 16);
//        System.out.println(result);
//        System.out.println(sentence.substring(11));



                                          //StringBuilder



        StringBuilder sb=new StringBuilder("Tony Stark");
//        System.out.println(sb);

        //char at index 0
//        System.out.println(sb.charAt(0));

        //set char at index 0
//        sb.setCharAt(0, 'P');
//        System.out.println(sb);

        //insert at index 2
//        System.out.println(sb.insert(2, 'n'));

        //delete both 'n'
//        System.out.println(sb.delete(2, 4));

        //append
//        StringBuilder str=new StringBuilder("H");
//        str.append("e");
//        str.append("l");
//        str.append("l");
//        str.append("o");
//        System.out.println(str);

        //length find
//        System.out.println(str.length());



        //reverse a string
        StringBuilder st = new StringBuilder("Keep Practice!");

        for (int i=0; i<st.length()/2; i++){
            int front = i;
            int back = st.length()-1-i;

            char frontChar = st.charAt(front);
            char backChar = st.charAt(back);

            st.setCharAt(front, backChar);
            st.setCharAt(back, frontChar);
        }
        System.out.println(st);
    }
}
