package PracticeQuestion;

//Find integer part of √n.
public class SquareRootUsingBinarySearch {
    public static void main(String[] args) {
        int n = 15;
        int result=0;
        int start=0, end=n;

        while (start <= end){
            int mid = (start+end)/2;
            if(mid*mid == n){
                result = mid;
                break;
            }
            else if(mid*mid < n){
                result = mid;
                start = mid+1;
            }else {
                end = mid-1;
            }
        }

        System.out.println(result);
    }
}
