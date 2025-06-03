
public class PrintNTo1Numbers {

    public static void main(String args[]) {
        int number = 10;
        printNumberInReverseOrderDec(number);
        System.out.println("");
        printNumberInReverseOrderInc(number);
    }

    public static void printNumberInReverseOrderDec(int number) {
        if (number == 0) {
            return;
        }
        System.out.print(number + " ");
        printNumberInReverseOrderDec(number - 1);

    }

    public static void  printNumberInReverseOrderInc(int number) {
        if (number == 0) {
            return;
        }
        printNumberInReverseOrderInc(number - 1);
        System.out.print(number + " ");

    }
}
