package algorithms;

public class InsertionSort {

    public InsertionSort(double[] array) {
        sort(array);
    }

    private void sort(double[] array) {
        if (array.length < 2) return;

        for (int i = 1; i < array.length; i++) {
            var key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}