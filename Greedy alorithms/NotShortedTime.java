
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class NotShortedTime {

    public static void main(String[] args) {
        int[] start = {0,1,3,5,5,8};
        int[] end = {6,2,4,7,9,9};

        ArrayList<Integer> a1 = new ArrayList<>();
        int max = 0  ;

        int[][] activity = new int[start.length][3];


        for (int i = 0; i < start.length; i++) {
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        Arrays.sort(activity , Comparator.comparingDouble(a->a[2]));

        a1.add(0);
        int count =1;
        max  = activity[0][2];


        for (int i = 1; i < start.length; i++) {
            if(activity[i][1] >= max){
                count++;
                max = activity[i][2];
                a1.add(i);
            }
        }


        for (int i = 0; i < a1.size(); i++) {
            System.out.print("A"+a1.get(i)+" ");
        }

    }
}
