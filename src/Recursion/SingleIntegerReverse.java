package Recursion;

public class SingleIntegerReverse {
    public static void main(String[] args) {
        int num=12345;
        int store=0;
        int result=singleInteger(num, store);
        System.out.println(result);
    }
    static  int singleInteger(int num, int store){
        if(num==0){
            return store;
        }
        int r=num%10;
        store=(store*10)+r;
        num=num/10;
        store=singleInteger(num, store);
        return store;
    }
}
