package BinarySearch;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1={10,15,20,35,40,55};
        int[] nums2={3,7,17,39,61,83};
        int i=0;
        int len1=nums1.length;
        int j=0;
        int len2=nums2.length;

        int[] result=new int[len1+len2];
        int p=0;
        while (i<len1 && j<len2){
            if(nums1[i]>nums2[j]){
                result[p]=nums2[j];
                p++;
                j++;
            }else if(nums1[i]<nums2[j]){
                result[p]=nums1[i];
                p++;
                i++;
            }
        }
        while (i<len1){
            result[p]=nums1[i];
            p++;
            i++;
        }
        while (j<len2){
            result[p]=nums2[j];
            p++;
            j++;
        }
        System.out.println(Arrays.toString(result));
    }
}
