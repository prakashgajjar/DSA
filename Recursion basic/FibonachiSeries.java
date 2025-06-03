
public class FibonachiSeries {

    public static void main(String[] args) {
        int number = 47;
        int result = fibonachiseries(number);
        System.err.println("fibonachi number for " + number + " is : " + result);
    }

    public static int fibonachiseries(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return fibonachiseries(number - 1) + fibonachiseries(number - 2);
    }
}
