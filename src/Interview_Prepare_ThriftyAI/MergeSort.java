package Interview_Prepare_ThriftyAI;

public class MergeSort {
    public static void conquer(int[] arr, int st, int mid, int en){
        int merged[] = new int[en-st+1];
        int idx1=st;
        int idx2=mid+1;
        int k = 0;

        while (idx1 <= mid && idx2 <= en){
            if(arr[idx1] <= arr[idx2]){
                merged[k] = arr[idx1];
                idx1++;
                k++;
            } else {
                merged[k] = arr[idx2];
                idx2++;
                k++;
            }
        }

        while (idx1 <= mid){
            merged[k] = arr[idx1];
            idx1++;
            k++;
        }

        while (idx2 <= en){
            merged[k] = arr[idx2];
            idx2++;
            k++;
        }

        for(int i=0; i<merged.length; i++){
            arr[st+i] = merged[i];
        }
    }
    public static void divide(int[] arr, int st, int en){
        if(st >= en){
            return;
        }

        int mid = (st+en)/2;
        divide(arr, st, mid);
        divide(arr, mid+1, en);
        conquer(arr, st, mid, en);
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
