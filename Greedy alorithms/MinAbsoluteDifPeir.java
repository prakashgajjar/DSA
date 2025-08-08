
import java.util.Arrays;

public class MinAbsoluteDifPeir {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,6};
        int[] arr2 = {2,1,3,5};
        int total = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            total += Math.abs(arr1[i] - arr2[i]);
        }

        System.out.println(total);

    }
}
