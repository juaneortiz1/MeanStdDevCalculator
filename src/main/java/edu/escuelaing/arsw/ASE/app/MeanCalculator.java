package edu.escuelaing.arsw.ASE.app;
/**
 * Utility class to calculate the mean (average)
 * of elements in a LinkedList.
 */
public class MeanCalculator {
    /**
     * Calculates the mean of elements in the given LinkedList.
     *
     * @param list LinkedList containing numeric elements.
     * @param <T>  Type of numeric elements.
     * @return Mean of elements list.
     */
    public static <T extends Number> double calculateMean(LinkedList<T> list) {
        double sum = 0;
        int count = 0;
        for (T number : list) {
            sum += number.doubleValue();
            count++;
        }
        return sum / count;
    }
}
