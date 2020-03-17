package algorithms;

public class MergeSort extends AbstractSortingAlgorithm {

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public void sort(double[] array) {
        if (array.length < 2) return;
        mergeSort(array, array.length);
    }

    private void mergeSort(double[] array, int size) {
        if (size < 2) return;

        int n = size / 2;
        double[] leftArray = new double[n];
        double[] rightArray = new double[size - n];

        for (int i = 0; i < n; i++) {
            leftArray[i] = array[i];
        }
        for (int i = n; i < size; i++) {
            rightArray[i - n] = array[i];
        }
        mergeSort(leftArray, n);
        mergeSort(rightArray, size - n);

        merge(array, leftArray, rightArray, n, size - n);
    }

    private void merge(double[] array, double[] leftArray, double[] rightArray, int leftArraySize, int rightArraySize) {

        int i = 0, j = 0, k = 0;
        while (i < leftArraySize && j < rightArraySize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < leftArraySize) {
            array[k++] = leftArray[i++];
        }
        while (j < rightArraySize) {
            array[k++] = rightArray[j++];
        }
    }
}