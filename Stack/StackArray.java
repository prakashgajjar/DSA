
import java.util.ArrayList;

public class StackArray {

    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        int size() {
            return list.size();
        }

        void push(int num) {
            list.add(num);
        }

        void pop() {
            list.remove(list.size() - 1);
        }

        int top() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s  = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        System.out.println(s.size());
        System.out.println(s.top());
    }
}
