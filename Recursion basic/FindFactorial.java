
public class FindFactorial {

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("factorial : " + result);
    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
