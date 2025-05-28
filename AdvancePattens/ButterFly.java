package AdvancePattens;

public class ButterFly {

    public static void main(String args[]) {
        ButterFly b1 = new ButterFly();
        int n = 4;
        b1.Butterfly(n);

    }

   void Butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if ((i - j) >= 0 || (i + j) >= 9) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 2 * n; j >=1 ; j--) {
                if ((i - j) >= 0 || (i + j) >= 9) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
