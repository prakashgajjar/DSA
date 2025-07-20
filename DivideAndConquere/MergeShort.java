
public class MergeShort {

    public static void main(String args[]) {
        int arr[] = {1, 4, 2, 8, 3, 9, 4};
        int si = 0;
        int ei = arr.length - 1;
        mergeShort(arr,si ,ei);
    }

    public static void mergeShort(int arr[], int si, int ei) {

        int mid = si + (ei - si) / 2;

        if (si >= ei) {
            return;
        }
        mergeShort(left);
        mergeShort(right);
    }
}
