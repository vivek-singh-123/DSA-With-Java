package LinearSearch;

class AnotherLinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        int key =73;

        for(int i=0; i<arr.length; i++) {
            if(key==arr[i]){
                System.out.print("Key is found: "+ key);
                return;
            }
        }
        System.out.print("Key is not found");

    }
}
