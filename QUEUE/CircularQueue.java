
public class CircularQueue {

    static class QueueB {

        int rear = -1;
        int front = 0;
        int size = 0;
        int capacity = 0;

        int arr[];

        public QueueB(int n) {
            arr = new int[n];
            size = n;
        }

        public boolean isEmpty() {
            return front > rear;
        }

        public int enqueue(int Data) {

            if (size != capacity) {
                rear = (rear + 1) % size;
                arr[rear] = Data;
                capacity++;
                return Data;
            } else {
                System.err.println("Queue is full");
                return -1;
            }
        }

        public int dequeue() {
            if (rear < front) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int value = arr[front];
                front = (front + 1) % size;
                capacity--;
                return value;

            }
        }

        public void show() {
            System.out.print("[ ");
            int i = front;
            while (true) {
                System.err.print(arr[i] + " ");
                if (i == rear) {
                    break;
                }
                i = (i + 1) % size;
            }
            System.out.print("]");
        }
    }

    public static void main(String args[]) {
        QueueB q1 = new QueueB(3);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.dequeue();
        q1.enqueue(50);



        q1.show();
    }
}
