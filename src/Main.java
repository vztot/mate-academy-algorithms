import algorithms.*;

public class Main {

    private static final int ARRAY_LENGTH = 50000;
    private static long TIME_BEFORE_SORT_MILLIS;
    private static double[] array;

    private static double[] generateRandomArrayOfDoubleValues(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    private static boolean isArraySorted(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("ERROR: array[] isn't sorted.");
                return false;
            }
        }
        return true;
    }

    private static double getSortingTime() {
        return (System.currentTimeMillis() - TIME_BEFORE_SORT_MILLIS)/1000d;
    }

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Algorithm      | Time (sec.)");
        System.out.println("============================");

        array = generateRandomArrayOfDoubleValues(ARRAY_LENGTH);
        TIME_BEFORE_SORT_MILLIS = System.currentTimeMillis();
        new QuickSort(array);
        if (isArraySorted(array)) System.out.println("Quick Sort     | " + getSortingTime());

        array = generateRandomArrayOfDoubleValues(ARRAY_LENGTH);
        TIME_BEFORE_SORT_MILLIS = System.currentTimeMillis();
        new MergeSort(array);
        if (isArraySorted(array)) System.out.println("Merge Sort     | " + getSortingTime());

        array = generateRandomArrayOfDoubleValues(ARRAY_LENGTH);
        TIME_BEFORE_SORT_MILLIS = System.currentTimeMillis();
        new InsertionSort(array);
        if (isArraySorted(array)) System.out.println("Insertion Sort | " + getSortingTime());

        array = generateRandomArrayOfDoubleValues(ARRAY_LENGTH);
        TIME_BEFORE_SORT_MILLIS = System.currentTimeMillis();
        new SelectionSort(array);
        if (isArraySorted(array)) System.out.println("Selection Sort | " + getSortingTime());

        array = generateRandomArrayOfDoubleValues(ARRAY_LENGTH);
        TIME_BEFORE_SORT_MILLIS = System.currentTimeMillis();
        new BubbleSort(array);
        if (isArraySorted(array)) System.out.println("Bubble Sort    | " + getSortingTime());

        System.out.println();
        System.out.format("After sorting array of %d random doubles we can see that Quick Sort is the fastest algorithm of listed above.", ARRAY_LENGTH);
        System.out.println();
    }
}