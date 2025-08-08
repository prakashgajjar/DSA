
import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {

    public static void main(String arsgs[]) {
        Integer[] ver = {2, 1, 3, 1, 4};
        Integer[] hor = {4, 1, 2};

        Arrays.sort(ver, Collections.reverseOrder());
        Arrays.sort(hor, Collections.reverseOrder());

        int v_value = 1;
        int h_value = 1;

        int v = 0;
        int h = 0;
        int total = 0;

        while (v < ver.length && h < hor.length) {
            if (ver[v] >= hor[h]) {
                total += h_value * ver[v];
                v++;
                v_value++;

            } else {
                total += v_value * hor[h];
                h++;
                h_value++;
            }
        }

        while (v < ver.length) {
            total += h_value * ver[v];
            v++;
            h_value++;
        }
        while (h < hor.length) {
            total += v_value * hor[h];
            h++;
            v_value++;
        }

        System.out.println(total);
    }
}
