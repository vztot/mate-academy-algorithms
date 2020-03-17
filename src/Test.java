import algorithms.*;

public class Test {

    private double[] array;
    private long TIME_BEFORE_SORT_MILLIS;

    private double[] generateRandomArrayOfDoubleValues(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    private boolean isArraySorted(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("ERROR: array[] isn't sorted.");
                return false;
            }
        }
        return true;
    }

    private double getSortingTime() {
        return (System.currentTimeMillis() - TIME_BEFORE_SORT_MILLIS)/1000d;
    }

    public Test(AbstractSortingAlgorithm algorithm, int length) {
        array = generateRandomArrayOfDoubleValues(length);
        TIME_BEFORE_SORT_MILLIS = System.currentTimeMillis();

        algorithm.sort(array);

        if (isArraySorted(array)) System.out.format("%14s | %4s \n", algorithm.getName(), getSortingTime() + "");
    }
}
