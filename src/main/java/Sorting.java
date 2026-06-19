public class Sorting {

    // Bubble Sort – by title (A -> Z)
    static Book[] bubbleSort(Book[] arr) {
        Book[] list = arr.clone();
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j].title.compareTo(list[j + 1].title) > 0) {
                    Book tmp   = list[j];
                    list[j]    = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
        return list;
    }

    // Selection Sort – by author (A -> Z)
    static Book[] selectionSort(Book[] arr) {
        Book[] list = arr.clone();
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (list[j].author.compareTo(list[minIdx].author) < 0)
                    minIdx = j;
            }
            Book tmp    = list[i];
            list[i]     = list[minIdx];
            list[minIdx] = tmp;
        }
        return list;
    }

    // Insertion Sort – by ID (ascending)
    static Book[] insertionSort(Book[] arr) {
        Book[] list = arr.clone();
        int n = list.length;
        for (int i = 1; i < n; i++) {
            Book key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].id > key.id) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
        return list;
    }
}
