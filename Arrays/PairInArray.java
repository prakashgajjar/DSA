
public class PairInArray {

    public static void main(String args[]) {
        int arr[] = {1, 2, 5, 8, 9};
        pairGenetor(arr);
    }

    public static void pairGenetor(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("[" + arr[i] + "," + arr[j] + "]");
            }
        }
    }
}
