package Array;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,10,11,15};
        int target=15;
        int len=arr.length;
        int i=0;
        int j=len-1;
        int sum=0;
        while(i<j){
            sum=arr[i]+arr[j];
            if(sum==target){
                System.out.println("index: "+i+" "+j);
                break;
            }else if (sum<target) {
                i++;
            }else{
                j--;
            }
        }
    }
}
