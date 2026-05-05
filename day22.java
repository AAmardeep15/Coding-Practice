class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class day5 {
    Node root;

    public day5() {
        root = null;
    }
    void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
    void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    // Postorder traversal: Left, Right, Root
    void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        day5 tree = new day5();
        
        // Creating a sample binary tree
        //       1
        //     /   \
        //    2     3
        //   / \
        //  4   5
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal (Root, Left, Right):");
        tree.printPreorder(tree.root);

        System.out.println("\n\nInorder traversal (Left, Root, Right):");
        tree.printInorder(tree.root);

        System.out.println("\n\nPostorder traversal (Left, Right, Root):");
        tree.printPostorder(tree.root);
        System.out.println();
    }
}
