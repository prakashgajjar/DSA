
import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> d1 = new LinkedList<>();
        d1.addFirst(12);
        d1.addFirst(34);
        d1.addLast(34);
        d1.addFirst(34);

        d1.removeFirst();

        System.out.println(d1);
    }
}
