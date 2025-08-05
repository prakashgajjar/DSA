import java.util.*;
public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.size());
        
        try {
            System.out.println(s.peek());
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}