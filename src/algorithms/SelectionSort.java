package algorithms;

public class SelectionSort extends AbstractSortingAlgorithm {

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public void sort(double[] array) {
        if (array.length < 2) return;

        for (int i = 0; i < array.length - 1; i++) {
            int indexOfMinimum = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexOfMinimum]) {
                    indexOfMinimum = j;
                }
            }
            var temp = array[i];
            array[i] = array[indexOfMinimum];
            array[indexOfMinimum] = temp;
        }
    }
}