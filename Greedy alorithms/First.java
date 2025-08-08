
import java.util.ArrayList;

public class First {

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        ArrayList<Integer> a1 = new ArrayList<>();
        int activity = 0;

        activity = 1;
        int max = end[0];
        a1.add(0);

        for (int i = 1; i < end.length; i++) {
            if(max <= start[i]){
                activity++;
                max = end[i];
                a1.add(i);
            }
        }
        for (int i = 0; i < a1.size(); i++) {
            System.out.print("A"+ a1.get(i) + " ");
        }
    }
}
