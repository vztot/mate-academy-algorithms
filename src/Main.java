import algorithms.*;

public class Main {

    private static final int ARRAY_LENGTH = 50000;

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Algorithm      | Time (sec.)");
        System.out.println("============================");

        AbstractSortingAlgorithm[] algorithms = {
                new QuickSort(),
                new MergeSort(),
                new InsertionSort(),
                new SelectionSort(),
                new BubbleSort(),
        };

        for (AbstractSortingAlgorithm algorithm : algorithms) {
            new Test(algorithm, ARRAY_LENGTH);
        }

        System.out.println();
        System.out.format("After sorting array of %d random doubles we can see that Quick Sort is the fastest algorithm of listed above.", ARRAY_LENGTH);
        System.out.println();
    }
}