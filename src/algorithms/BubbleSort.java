package algorithms;

public class BubbleSort extends AbstractSortingAlgorithm {

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public void sort(double[] array) {
        if (array.length < 2) return;

        int i = 0;
        boolean needSort = true;
        while (i < array.length - 1 && needSort) {
            needSort = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    var temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    needSort = true;
                }
            }
            if (!needSort) break;
            i++;
        }
    }
}