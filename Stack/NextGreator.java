
import java.util.Stack;

public class NextGreator {

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        int nextGreator[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.empty() && (s.peek() <= arr[i])) {
                s.pop();
            }

            if (s.empty()) {
                nextGreator[i] = -1;

            } else {
                nextGreator[i] = s.peek();
                s.pop();
            }

             s.push(arr[i]);
        }

        for (int j = 0; j < nextGreator.length; j++) {
            System.out.println(nextGreator[j]);
        }

    }
}
