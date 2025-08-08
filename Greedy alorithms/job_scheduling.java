
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class job_scheduling {
    public static void main(String[] args) {
        int[][] jobs ={{4,20},{1,10},{1,20},{1,40}};
        int max = 0;
        int profit = 0;

        ArrayList<Integer> a1 = new ArrayList<>();

        Arrays.sort(jobs, Comparator.comparingDouble((int []a) -> a[1]).reversed());


        a1.add(jobs[0][0]);
        profit = jobs[0][1];
        max=1;
        for (int i = 1; i < jobs.length; i++) {
            if(jobs[i][0] > max ){
                max++;
                profit += jobs[i][1];
                a1.add(jobs[i][0]); 
            }
        }

        System.out.println(profit);
    }
}
