
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class KnapShak {

    public static void main(String args[]) {
        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};

        float max_weight = 50;
        int total = 0;

        double[][] activity = new double[weight.length][3];
        ArrayList<Integer> a1 = new ArrayList<>();

        for (int i = 0; i < weight.length; i++) {
            activity[i][0] = weight[i];
            activity[i][1] = value[i];
            activity[i][2] = (double) value[i] / weight[i];
        }
        Arrays.sort(activity, new Comparator<double[]>() {
            @Override
            public int compare(double[] a, double[] b) {
                return Double.compare(b[2], a[2]);
            }
        });

        int j = 0;

        while (max_weight != 0) {
            if (max_weight < activity[j][0]) {
                total += activity[j][1] * (max_weight / activity[j][0]);
                break;
            } else {
                total += activity[j][1];
                max_weight -= activity[j][0];
                j++;
            }
        }

        System.out.println(total);

    }
}
