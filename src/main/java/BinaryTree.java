public class BinaryTree {

    static class Node {
        Book book;
        Node left;
        Node right;

        Node(Book book) {
            this.book = book;
        }
    }

    Node root;

    void insert(Book book) {
        Node newNode = new Node(book);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        while (true) {
            if (book.id < current.book.id) {
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
    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.println("  " + node.book);
        inorder(node.right);
    }

    Book search(int id) {
        Node current = root;
        while (current != null) {
            if (id == current.book.id)
                return current.book;
            else if (id < current.book.id)
                current = current.left;
            else
                current = current.right;
        }
        return null;
    }
}
