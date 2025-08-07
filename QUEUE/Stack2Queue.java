
import java.util.LinkedList;
import java.util.Queue;

public class Stack2Queue {

    static class Stack {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public int pop() {
            int top = 0;
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            } else {
                if (q1.isEmpty()) {

                    while (!q2.isEmpty()) {
                        top = q2.remove();
                        if (!q2.isEmpty()) {
                            q1.add(top);
                        } else {
                            break;
                        }
                    }

                } else {
                    if (q2.isEmpty()) {

                        while (!q1.isEmpty()) {
                            top = q1.remove();
                            if (!q1.isEmpty()) {
                                q2.add(top);
                            } else {
                                break;
                            }
                        }
                    }
                }
                return top;
            }
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        System.err.println(s1.pop());
        System.err.println(s1.pop());
        System.err.println(s1.pop());

    }
}
