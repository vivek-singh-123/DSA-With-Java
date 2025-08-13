package StringDS;

public class StringToIntegerAndViceVersa {
    public static void main(String[] args) {
        String str="100";
        System.out.println("String:---");
        System.out.println(str);
        System.out.println(str+10);

        //convert into integer
        System.out.println("Integer:---");

        //through parseInt

        int num = Integer.parseInt(str);
        System.out.println(num);
        System.out.println(num+10);

        //again into String
        System.out.println("again string:---");
        String str2=Integer.toString(num);
        System.out.println(str2+11);


        //through valueOf
        int num2=Integer.valueOf(str);
        System.out.println(num2+5);

        String str3=String.valueOf(num2);
        System.out.println(str3+7);
    }
}
