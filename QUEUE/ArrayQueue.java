
public class ArrayQueue {

    static class QueueB {

        int rear = -1;
        int front = 0;
        int size = 0;

        int arr[];

        public QueueB(int n) {
            arr = new int[n];
            size = n;
        }

        public boolean isEmpty() {
            return front > rear;
        }

        public int enqueue(int Data) {
            rear++;
            arr[rear] = Data;
            return Data;
        }

        public int dequeue() {
            if (rear < front) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int value = arr[front];
                front++;
                return value;

            }
        }

        public void show() {
            System.out.print("[ ");
            for (int i = front; i <= rear; i++) {
                System.err.print(arr[i] + " ");
            }
            System.out.print("]");
        }
    }

    public static void main(String args[]) {
        QueueB q1 = new QueueB(10);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.dequeue();
        q1.dequeue();

        q1.show();
    }
}
