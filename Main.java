class BinarySearchTree {
    static class Node {
        int key;
        Node left, right;

        // Constructor
        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Utility function to create a new BST node
    static Node newNode(int item) {
        return new Node(item);
    }

    // Utility function to perform inorder traversal of BST
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    // Utility function to insert a new node with given key in BST
    static Node insert(Node node, int key) {
        if (node == null)
            return newNode(key);
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        return node;
    }

    // Utility function to find the node with minimum key value in a given BST
    static Node minValueNode(Node node) {
        Node current = node;
        while (current != null && current.left != null)
            current = current.left;
        return current;
    }

    // Utility function to delete the node with given key in BST
    static Node deleteNode(Node root, int key) {
        if (root == null)
            return root;
        if (key < root.key)
            root.left = deleteNode(root.left, key);
        else if (key > root.key)
            root.right = deleteNode(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.key = minValueNode(root.right).key;
            root.right = deleteNode(root.right, root.key);
        }
        return root;
    }

    // Driver code
    public static void main(String[] args) {
	/* Let us create following BST
		    50
		   /  \
		  30   70
		 / \   / \
	    20 40 60 80 */
        Node root = null;
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        System.out.println("Inorder traversal of the given tree:");
        inorder(root);

        System.out.println("\nDelete 20:");
        root = deleteNode(root, 20);
        System.out.println("Inorder traversal of the modified tree:");
        inorder(root);

        System.out.println("\nDelete 30:");
        root = deleteNode(root, 30);
        System.out.println("Inorder traversal of the modified tree:");
        inorder(root);

        System.out.println("\nDelete 50:");
        root = deleteNode(root, 50);
        System.out.println("Inorder traversal of the modified tree:");
        inorder(root);
    }
}