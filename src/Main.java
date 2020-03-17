import algorithms.*;

public class Main {

    private static final int ARRAY_LENGTH = 50000;

    public static void main(String[] args) {

        try{Thread.sleep(2000);}
        catch (Exception e){}

        System.out.println("\n" +
                "Algorithm      | Time (sec.)\n" +
                "============================");

        AbstractSortingAlgorithm[] algorithms = {
                new QuickSort(),
                new MergeSort(),
                new InsertionSort(),
                new SelectionSort(),
                new BubbleSort(),
        };

        for (AbstractSortingAlgorithm algorithm : algorithms) {
            new Test(algorithm, ARRAY_LENGTH);
            try{Thread.sleep(1000);}
            catch (Exception e){}
        }

        System.out.format("\n" +
                "After sorting array of %d random doubles we can see that Quick Sort is the fastest algorithm of listed above.\n", ARRAY_LENGTH);
    }
}