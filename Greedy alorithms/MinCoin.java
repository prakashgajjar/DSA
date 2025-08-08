
import java.util.ArrayList;

public class MinCoin {
    public static void main(String[] args) {
        int []coins = {1,2,5,10,20,50,100,200,500,1000,2000};
        int number = 423;

        ArrayList<Integer> a1 = new ArrayList<>();
        int sum = 0;
        int count = coins.length-1;


       while(number !=0){
            if(coins[count] <= number){
                number-= coins[count];
                a1.add(coins[count]);
                sum++;
            }else{
                count--;
            }
        }
          
        System.out.println(sum);

        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
    }
}