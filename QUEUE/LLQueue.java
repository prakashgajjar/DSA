
public class LLQueue {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LL {

        Node head = null;

        public int add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return head.data;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }

                current.next = newNode;
                return newNode.data;
            }
        }

        public int remove() {
            if (head == null) {
                System.out.println("Queue is empty!");
                return -1;
            } else {
                int value = head.data;
                head = head.next;
                return value;
            }
        }

        public void display() {

            Node current = head;
            System.out.println(current.data);
            while (current.next != null) {
                current = current.next;
                System.out.println(current.data);
            }
        }
    }

    public static void main(String[] args) {
        LL l1 = new LL();

        l1.add(23);
        l1.add(45);
        l1.add(46);
        l1.add(48);

        l1.remove();

        l1.display();
    }
}
