package AdvancePattens;

public class HolloRectangle{
    public static void main(String args[]){
        int row = 3;
        int column = 10;
        for (int i=1 ; i<=row ; i++){ //row
            for(int j=1; j<=column ; j++){ // column
                if(i==1 || i==row || j==1 || j==column){
                    System.err.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}