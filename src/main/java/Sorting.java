public class Sorting {

    // Quick Sort – by title (A -> Z)
    static Book[] quickSort(Book[] arr) {
        Book[] list = arr.clone();
        quickSortHelper(list, 0, list.length - 1);
        return list;
    }

    private static void quickSortHelper(Book[] list, int low, int high) {
        if (low < high) {
            int p = partition(list, low, high);
            quickSortHelper(list, low, p - 1);
            quickSortHelper(list, p + 1, high);
        }
    }

    private static int partition(Book[] list, int low, int high) {
        String pivot = list[high].title;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (list[j].title.compareTo(pivot) <= 0) {
                i++;
                Book tmp = list[i]; list[i] = list[j]; list[j] = tmp;
            }
        }
        Book tmp = list[i + 1]; list[i + 1] = list[high]; list[high] = tmp;
        return i + 1;
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
