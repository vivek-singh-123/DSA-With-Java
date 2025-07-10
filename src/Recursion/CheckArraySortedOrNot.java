package Recursion;

public class CheckArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr={10,50,78,116,188,264};
        int i=0;
        boolean result=arraySortOrNot(arr, i);
        System.out.println(result);

    }
    static  boolean arraySortOrNot(int[] arr, int i){
        if(i>=arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return arraySortOrNot(arr, i+1);
        }
        return  false;
    }
}
