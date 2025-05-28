package AdvancePattens;

public class InvertedHalfPiramid {
    public static  void main(String args []){
        InvertedHalfPiramid i = new InvertedHalfPiramid();
        int num = 5;
        i.halfPiramid(num);
    }

    void halfPiramid(int num){
        for(int i=0 ; i<num ; i++){
            for(int k=0; k<num-i ; k++){
                System.out.print(" ");
            }
            for(int j=0 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
}
}
