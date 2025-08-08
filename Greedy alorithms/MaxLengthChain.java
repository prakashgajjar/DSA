
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChain {
    public static void main(String[] args) {
        int [][] chain = {{5,24},{39,60}, {5,28} , {27,40},{50,90}};
        int max = 0;
        int count = 0;

        ArrayList<Integer> a1 = new ArrayList<>();

        Arrays.sort(chain , Comparator.comparingDouble(a->a[1]));

        count++;
        a1.add(0);
        max = chain[0][1];
        for (int i = 1; i < chain.length; i++) {
            if(chain[i][0] > max){
                max = chain[i][1];
                count++;
                a1.add(i);
            }
        }

        System.out.println("answer : "+count);
        for (int i =0; i < a1.size(); i++) {
            System.out.print(a1.get(i) +" ");
        }

    }
}
