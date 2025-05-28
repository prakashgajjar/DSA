package AdvancePattens;

public class SolidRhombus {
    public static void main(String args[]){
     SolidRhombus s1 = new SolidRhombus();
        int n = 5;
        s1.SolidRhombusPatten(n);
    }
    void SolidRhombusPatten(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
