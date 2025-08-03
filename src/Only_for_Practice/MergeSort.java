package Only_for_Practice;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={21,66,19,110,7,25,51,33,41,87};
        int len=arr.length;
        divide(arr, 0,len-1);

        for(int a:arr){
            System.out.print(a+" ");
        }
    }

    public static void divide(int[] arr, int start, int end){
        if(start>=end){
            return;
        }

        int mid=(start+end)/2;
        divide(arr, start, mid);
        divide(arr,mid+1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end){
        int len1=mid-start+1;
        int len2=end-mid;

        int[] arr1=new int[len1];
        int[] arr2=new int[len2];

        for (int i=0; i<len1; i++){
            arr1[i]=arr[start+i];
        }

        for(int j=0; j<len2; j++){
            arr2[j]=arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=start;

        while (i<len1 && j<len2){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }else {
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }

        while (i<len1){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while (j<len2){
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }
}
