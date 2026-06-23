public class Sorting {

    // Bubble Sort – by title (A -> Z)
    static Book[] bubbleSort(Book[] arr) {
        Book[] list = arr.clone();
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {           //Anzahl an Durchlüfe (max n-1 mal)
            for (int j = 0; j < n - 1 - i; j++) {   //durchläuft unsortierte Elemente (-n für berreits sortierte Elemente)
                if (list[j].getTitle().compareTo(list[j + 1].getTitle()) > 0) {
                    Book tmp = list[j];
                    list[j] = list[j + 1];
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
        for (int i = 0; i < n - 1; i++) {       //i = aktuelle Position
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {   //durchläuft unsortierte Elemente rechts von i
                if (list[j].getAuthor().compareTo(list[minIndex].getAuthor()) < 0)
                    minIndex = j;
            }
            if (minIndex != i) {
                Book tmp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = tmp;
            }
        }
        return list;
    }

    // Insertion Sort – by ID (ascending)
    static Book[] insertionSort(Book[] arr) {
        Book[] list = arr.clone();
        int n = list.length;
        for (int i = 1; i < n; i++) {       //starten bei index 1
            Book key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].getId() > key.getId()) {       //1. In der Liste 2. Links > Rechts
                list[j + 1] = list[j];
                j--;                    //wandert im sortierten Bereich bis zur richtigen Position
            }
            list[j + 1] = key;
        }
        return list;
    }
}
