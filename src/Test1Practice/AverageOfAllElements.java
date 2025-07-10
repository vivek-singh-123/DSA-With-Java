package Test1Practice;

public class AverageOfAllElements {
    public static void main(String[] args) {
        int[] arr={21,7,4,9,2,7,38,1};
        int len=arr.length;
        int add=0;
        for(int i=0; i<len; i++){
            add+=arr[i];
        }
       int average= add/len;
        System.out.println(average);
    }
}
