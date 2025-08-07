
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverse {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Queue<Integer> q1 = new LinkedList<>();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);

        while(!q1.isEmpty()){
            s1.push(q1.remove());
        }

        while(!s1.isEmpty()){
            q1.add(s1.pop());
        }

        System.out.println(q1);
    }
}
