
public class ReverseArray {

    public static void main(String args[]) {
        int arr[] = {1, 6, 2};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        
        System.out.println("");
        ReverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public static void ReverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start != arr.length / 2) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
