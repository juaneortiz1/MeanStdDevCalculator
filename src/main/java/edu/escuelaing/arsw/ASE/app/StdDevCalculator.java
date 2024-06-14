package edu.escuelaing.arsw.ASE.app;
/**
 * Utility class to calculate the standard deviation
 * of elements in a LinkedList.
 */
public class StdDevCalculator {
    /**
     * Calculates the standard deviation of elements in the given LinkedList.
     *
     * @param list LinkedList containing numeric elements.
     * @param mean Mean of elements.
     * @param <T>  Type of numeric elements.
     * @return Standard deviation of elements in the list.
     */
    public static <T extends Number> double calculateStdDev(LinkedList<T> list, double mean) {
        double sum = 0;
        int count = 0;
        for (T number : list) {
            sum += Math.pow(number.doubleValue() - mean, 2);
            count++;
        }
        return Math.sqrt(sum / (count-1));
    }
}
