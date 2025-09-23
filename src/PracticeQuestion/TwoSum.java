package PracticeQuestion;

//Given an array of integers nums and a target value target, find indices of two numbers such that they add up to target.
//You may assume that each input has exactly one solution.
//You cannot use the same element twice.
public class TwoSum {
    public static void main(String[] args) { //T.C ==> O(n^2)
        int[] arr = {2,11,20,7,15,8};
        int target = 9;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("target found at index: "+i+","+j);
                }
            }
        }
    }
}
