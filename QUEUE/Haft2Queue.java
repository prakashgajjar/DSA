
import java.util.LinkedList;
import java.util.Queue;

public class Haft2Queue {

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        
        int size = q1.size();
        for (int i = 0; i < size/2; i++) {
            q2.add(q1.remove());
        }

        System.out.println(q1);
        System.out.println(q2);

        while(!q2.isEmpty()){
                q1.add(q2.remove());
                q1.add(q1.remove());
        }

        System.out.println(q1);






    }
}
