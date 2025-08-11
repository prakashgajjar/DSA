
public class TotalNodesCount {

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

        public static Node addTree(int arr[]) {
            count++;
            if (count >= arr.length || arr[count] == -1) {
                return null;
            }

            Node newNode = new Node(arr[count]);

            newNode.left = addTree(arr);
            newNode.right = addTree(arr);
            return newNode;
        }

        public static int  diameter(Node root) {

            if (root == null) {
                return 0;
            }
            int left = diameter(root.left);
            int right = diameter(root.right);
            int h1 = height(root.left);
            int h2 = height(root.right);
            
            int d1 = left + right +1;

           return Math.max(d1, Math.max(h1, h2));
        }

        public static int count(Node root) {
            if (root == null) {
                return 0;
            }
            return 1 + count(root.left) + count(root.right);
        }

        public static int height(Node root) {
            if (root == null) {
                return -1;
            }
            int right = height(root.right);
            int left = height(root.left);

            int max = Math.max(right, left) + 1;

            return max;
        }

        public static int sum(Node root) {
            if (root == null) {
                return 0;
            }

            return root.data + sum(root.left) + sum(root.right);
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 4, -1, 5, -1, -1, 3, 6, -1, -1, -1};

        Node root = Tree.addTree(arr);
        System.out.println(Tree.count(root));
        System.out.println(Tree.sum(root));
        System.out.println(Tree.height(root));
        System.out.println(Tree.diameter(root));
    }
}
