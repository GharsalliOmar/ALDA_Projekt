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
            root = newNode;         //Wenn der Baum leer ist -> neuer Knoten wird Wurzel
            return;
        }
        Node current = root;
        while (true) {
            if (book.getId() < current.book.getId()) {      //Wenn ID  kleiner als current node -> gehts links weiter
                if (current.left == null) {
                    current.left = newNode;                 //freier Platz -> einfügen
                    return;
                }
                current = current.left;                     //kein Platz -> einen Schritt links weiter
            } else {                                        //Wenn ID  kleiner als current node -> gehts rechts weiter
                if (current.right == null) {
                    current.right = newNode;                //freier Platz -> einfügen
                    return;
                }
                current = current.right;                     //kein Platz -> einen Schritt rechts weiter
            }
        }
    }

    // Inorder traversal: left -> root -> right (produces ascending ID order)
    void inorder() {
        inorder(root);              //Einstiegspunkt -> ruft root node auf
    }

    private void inorder(Node node) {
        if (node == null) return;           //Abbruchbedingung -> wenn node leer ist
        inorder(node.left);                 //Klappert linke Seite ab bis null erreicht wird
        System.out.println("  " + node.book);
        inorder(node.right);
    }

    Book search(int id) {
        Node current = root;                        //Startpunkt an der root node
        while (current != null) {                   //schleife läuft bis keine node übrig ist
            if (id == current.book.getId())         //schleife läuft bis gewünschte Node gefunden ist
                return current.book;
            else if (id < current.book.getId())     //Wenn gesuchte ID kleiner ist dann links weitergehen
                current = current.left;
            else
                current = current.right;            //sonst rechts gehen
        }
        return null;                                //kein Treffer -> Buch existiert nd
    }
}
