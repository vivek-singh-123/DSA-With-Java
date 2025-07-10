package LinearSearch;

class LinearSearch {
    public static void main(String[] args) {

        System.out.println(linearSearch(new int[]{10,20,30,40,50,60,70},40));
    }

    public static boolean linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return  true;
            }
        }
        return false;
    }
}
