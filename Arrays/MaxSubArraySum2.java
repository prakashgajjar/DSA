
public class MaxSubArraySum2 {

    public static void main(String args[]) {
        int arr[] = {1, 2, -1, 4, 5, 3};
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum =(i==0) ? prefix[j] : prefix[j] - prefix[i-1] ;

                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
