package AdvancePattens;

public class HolloRhombus {
    public static void main(String args[]){
        HolloRhombus h1 = new HolloRhombus();
        int n = 5;
        h1.HolloRhombusPatten(n);
    }
    void HolloRhombusPatten(int n ){
        for (int i = 0; i < n; i++) {
            for (int j = n; j >i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < n; j++) {
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
    