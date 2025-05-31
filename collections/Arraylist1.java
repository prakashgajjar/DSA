
import java.util.ArrayList;

public class ArrayList1{
    public static void main(String args[]){
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(12);
        l1.add(13);
        l1.add(14);
        System.out.print(l1);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(22);
        l2.add(33);
        l2.add(44);
        System.out.print(l2);

        ArrayList<Integer> l3 = new ArrayList<>();
        l3.addAll(l1);
        l3.addAll(l2);
        System.out.print(l3);

        System.out.println(l1.get(1));
        l3.add(2,56);
        System.out.println(l3);

    }
}