public class FindXpowerN {

    public static void main(String[] args) {
        int x = 2;
        int n = 7;
        System.out.println(findXpowerN(x, n));
    }

    public static int findXpowerN(int x, int n) {
        if (n == 0) return 1;         // x^0 = 1
        if (x == 0) return 0;         // 0^n = 0
        if (n == 1) return x;         // x^1 = x

        int halfPower = findXpowerN(x, n / 2);

        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return x * halfPower * halfPower;
        }
    }
}
