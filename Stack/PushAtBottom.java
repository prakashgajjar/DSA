import java.util.*;
public class PushAtBottom {

    public  static void PushAtBottom(Stack<Integer> s,int num){

        if(s.isEmpty()){
            s.push(num);
            return;
        }

        int top = s.pop();
        PushAtBottom(s, num);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(3);
        s.push(2);

        PushAtBottom(s, 5);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
