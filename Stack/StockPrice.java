import java.util.*;
public class StockPrice {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int maxPrice = 0;
        Stack<Integer> s = new Stack();
    
        for(int price : prices ){
            if(s.empty()){
                s.push(price);
            }else{
              while(s.peek() <= price){
                s.pop();
              }
              s.push(price);
              maxPrice = Math.max(maxPrice, s.size());
            }

        }
    }
}
