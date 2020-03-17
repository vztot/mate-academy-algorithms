package algorithms;

public class QuickSort {

    public QuickSort(double[] array) {
        sort(array);
    }

    private void sort(double[] array) {
        if (array.length < 2) return;
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(double array[], int min, int max) {
        if (min < max) {
            int pivotIndex = partition(array, min, max);
            quickSort(array, min, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, max);
        }
    }

    private int partition(double array[], int min, int max) {
        var pivot = array[max];
        int i = (min - 1);

        for (int j = min; j < max; j++) {
            if (array[j] <= pivot) {
                i++;
                var temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        var temp = array[i + 1];
        array[i + 1] = array[max];
        array[max] = temp;
        return (i + 1);
    }
}