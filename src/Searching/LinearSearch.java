package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array={5,7,20,5,10,65,40,75};
        int target=65;

        for(int i=0; i<array.length; i++){
            if(array[i]==target){
                System.out.println("target index is: "+i);
                return;
            }
        }
        System.out.println("target not found!");
    }
}
