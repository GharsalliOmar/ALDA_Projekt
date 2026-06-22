public class BinaryTree {

    static class Node {
        Book book;
        Node left;
        Node right;

        Node(Book book) {
            this.book = book;
        }
    }

    private Node root;

    void insert(Book book) {
        Node newNode = new Node(book);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        while (true) {
            if (book.getId() < current.book.getId()) {
                if (current.left == null) {
                    current.left = newNode;
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    return;
                }
                current = current.right;
            }
        }
    }

    // Inorder traversal: left -> root -> right (produces ascending ID order)
    void inorder() {
        inorder(root);
    }

    private void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.println("  " + node.book);
        inorder(node.right);
    }

    Book search(int id) {
        Node current = root;
        while (current != null) {
            if (id == current.book.getId())
                return current.book;
            else if (id < current.book.getId())
                current = current.left;
            else
                current = current.right;
        }
        return null;
    }
}
