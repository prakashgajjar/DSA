
import java.util.*;

public class ReverseString {

    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();

        int ind = 0;
        while (ind < str.length()) {
            s.push(str.charAt(ind));
            ind++;
        }

        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "hello";
        String str2 = reverse(str);
        System.out.print(str2);
    }
}
