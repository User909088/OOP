package Interface.Sortable;

interface Sortable {
    void sort(int[] array);
}

// Bubble Sort implementation
class BubbleSort implements Sortable {

    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

// Selection Sort implementation
class SelectionSort implements Sortable {

    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}

// Main class to test sorting
public class Main {
    public static void main(String[] args) {
        int[] array = {12, 3, 43, 10, 5};

        // Test Bubble Sort
        int[] bubbleArray = array.clone(); // make a copy
        BubbleSort bubble = new BubbleSort();
        bubble.sort(bubbleArray);
        System.out.println("Bubble Sort:");
        printArray(bubbleArray);

        // Test Selection Sort
        int[] selectionArray = array.clone(); // make a copy
        SelectionSort selection = new SelectionSort();
        selection.sort(selectionArray);
        System.out.println("Selection Sort:");
        printArray(selectionArray);
    }

    // Utility method to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}
