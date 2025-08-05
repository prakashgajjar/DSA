
public class StackLinklist {
    static class Stack {
        static  Node head = null;

        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static boolean isEmpty() {
            return head == null;
        }

        public static int push(int data){
            Node newNode = new Node(data);
            
            if(isEmpty()){
                head = newNode;
                return head.data;
            }
            newNode.next = head;
            head = newNode;
            return head.data;
            
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int top(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(0);
        s.push(1);
        s.push(2);
        // System.out.println(s.top());

        for(int i=0;i<3;i++){
            System.out.println(s.pop());
        }

    }
}
