package AdvancePattens;

public class Diamond {

    public static void main(String[] args) {
        Diamond d1 = new Diamond();
        int n = 5;
        d1.DiamondPatten(n);
    }

    void DiamondPatten(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (int i = n; i >= 1; i--) {
            for (int j = (n - i); j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
