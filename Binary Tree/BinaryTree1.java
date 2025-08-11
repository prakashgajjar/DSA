
public class BinaryTree1 {

    static class Node {

        int data;
        Node left = null;
        Node right = null;

        Node(int data) {
            this.data = data;
        }
    }

    static class Tree {

        static int count = -1;

        public static Node add(int arr[]) {
            count++;
            if (arr[count] == -1) {
                return null;
            }

            Node newNode = new Node(arr[count]);

            newNode.left = add(arr);
            newNode.right = add(arr);

            return newNode;
        }

        public static void preOrderTrav(Node head){
            if(head == null){
                return;
            }
            System.err.print(head.data +" ");
            preOrderTrav(head.left);
            preOrderTrav(head.right);
        }

         public static void inOrderTrav(Node head){
            if(head == null){
                return;
            }
            preOrderTrav(head.left);
            System.err.print(head.data + " ");
            preOrderTrav(head.right);
        }

         public static void postOrderTrav(Node head){
            if(head == null){
                return;
            }
            preOrderTrav(head.left);
            preOrderTrav(head.right);
            System.err.print(head.data + " ");
        }
    }

    public static void main(String[] args) {
        int[] tree = {10, 5, 3, -1, -1, 7, -1, -1, 15, 12, -1, -1, 18, -1, -1};
        Tree t1 = new Tree();
        Node root = Tree.add(tree);
        // System.out.println(root.data);
        Tree.preOrderTrav(root);
        System.err.println("");
        Tree.inOrderTrav(root);
        System.err.println("");
        Tree.postOrderTrav(root);

    }
}
