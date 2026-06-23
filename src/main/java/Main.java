public class Main {

    public static void main(String[] args) {

        // 10 dummy books
        Book[] books = {
            new Book( 7, "Faust",                 "Johann Wolfgang von Goethe"),
            new Book( 3, "The Trial",              "Franz Kafka"              ),
            new Book( 9, "Buddenbrooks",           "Thomas Mann"              ),
            new Book( 1, "The Metamorphosis",      "Franz Kafka"              ),
            new Book( 5, "Steppenwolf",            "Hermann Hesse"            ),
            new Book(10, "Effi Briest",            "Theodor Fontane"          ),
            new Book( 2, "All Quiet on the Western Front", "Erich Maria Remarque"),
            new Book( 8, "Siddhartha",             "Hermann Hesse"            ),
            new Book( 4, "The Magic Mountain",     "Thomas Mann"              ),
            new Book( 6, "Demian",                 "Hermann Hesse"            ),
        };

        // Binary Tree
        BinaryTree tree = new BinaryTree();
        for (Book b : books)
            tree.insert(b);

        System.out.println("--- Binary Tree: all books (inorder, by ID) ---");
        tree.inorder();
        System.out.println("");

        System.out.println("--- Binary Tree: search ID 5 ---");
        Book found = tree.search(5);
        System.out.println(found != null ? found : "Not found");
        System.out.println("");


        System.out.println("--- Bubble Sort: by title (A->Z) ---");
        print(Sorting.bubbleSort(books));
        System.out.println("");


        System.out.println("--- Selection Sort: by author (A->Z) ---");
        print(Sorting.selectionSort(books));
        System.out.println("");


        System.out.println("--- Insertion Sort: by ID (ascending) ---");
        print(Sorting.insertionSort(books));
        System.out.println("");

    }

    static void print(Book[] books) {
        for (Book b : books)
            System.out.println(b);
    }
}
