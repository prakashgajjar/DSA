
public class CountingSort {

    public static void main(String args[]) {
        int[] arr = {0, 1, 2, 4, 5, 2, 0, 2, 5, 5, 5, 5, 2, 2};
        countingSort(arr, 0, 5);
    }

    static int countingSort(int arr[], int small, int big) {
        int range = big - small + 1;
        int arr1[] = new int[range];

        for (int i = 0; i < arr.length; i++) {
            arr1[arr[i] - small]++;
        }

        for (int i = 0; i < range; i++) {

            while (arr1[i] != 0) {
                System.err.println(i);
                arr1[i]--;
            }
        }

        return 0;
    }
}
