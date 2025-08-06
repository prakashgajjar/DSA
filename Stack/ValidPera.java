
import java.util.Stack;

public class ValidPera {

    public static void main(String[] args) {
        String str = "[{([{])}]";

        Stack<Character> s1 = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if ((ch == '[') || (ch == '{') || (ch == '(')) {
                s1.push(ch);
            } else {

                if (s1.isEmpty()) {
                    System.out.println("Str is not valid");
                    return;
                }
                char top = s1.pop();
                if ((ch == ')' && top != '(')
                        || (ch == '}' && top != '{')
                        || (ch == ']' && top != '[')) {
                    System.out.println("Str is not valid");
                    return;
                }
            }
        }

        if (s1.empty()) {
            System.out.println("Str is valid");
        } else {
            System.out.println("Str is not valid");

        }
    }
}
