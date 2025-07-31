package Only_for_Practice;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8, 7, 30, 4, 10, 6, 11, 20};
        bubbleSort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int len = arr.length;

        //increasing order
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


    }
}
