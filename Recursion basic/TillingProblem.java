
public class TillingProblem {

    public static void main(String[] args) {
        int n = 20;
        System.out.println(tillingProblem(n));
    }

    public static int tillingProblem(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        int fun1 = tillingProblem(n - 1);
        int fun2 = tillingProblem(n - 2);
        return fun1 + fun2;
    }
}
