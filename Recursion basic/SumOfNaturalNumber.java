public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int number = 3;
        int result = sumOfNaturalNumber(number);
        System.out.println("Sum of natural numbers : " + result);
    }
    public static int sumOfNaturalNumber(int number){
        if(number == 0){
            return 0;
        }
        return number + sumOfNaturalNumber(number-1);
    }
}
