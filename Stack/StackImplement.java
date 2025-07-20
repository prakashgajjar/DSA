package Stack;

import java.util.ArrayList;

public class StackImplement {

    static class Stack{

       static Arraylist<Integer> list = new ArrayList<>();

        public static Boolean isEmpty(){
            return list.size() == 0;
        }
        public static void push(int num){
            list.add(num);
        }
        public static int pop(){
            int ele = list.get(list.size()-1);
            list.remove(ele);
            return ele;
        }

        public static int peek(){
            int top  = list.get(list.size() - 1);
            return top;
        }
    }

    Stack s = new Stack();
    s.push(12);
    s.push(13);
    s.push(14);
    s.push(15);

}
