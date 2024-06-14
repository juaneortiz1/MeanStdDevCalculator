package edu.escuelaing.arsw.ASE.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * JUnit test class for testing the MeanCalculator and StdDevCalculator.
 */
public class CalculatorTest {
    private LinkedList<Double> createLinkedList(Double... values) {
        LinkedList<Double> list = new LinkedList<>();
        for (Double value : values) {
            list.add(value);
        }
        return list;
    }
    @Test
    public void testMeanCalculator() {
        LinkedList<Double> column1 = createLinkedList(160.0, 591.0, 114.0, 229.0, 230.0, 270.0, 128.0, 1657.0, 624.0, 1503.0);
        double mean = MeanCalculator.calculateMean(column1);
        assertEquals(550.6, mean, 0.01); // Expected mean for Column 1
    }

    @Test
    public void testStdDevCalculator() {
        LinkedList<Double> column2 = createLinkedList(15.0, 69.9, 6.5, 22.4, 28.4, 65.9, 19.4, 198.7, 38.8, 138.2);
        double mean = MeanCalculator.calculateMean(column2);
        double stdDev = StdDevCalculator.calculateStdDev(column2, mean);
        assertEquals(60.32, mean, 0.01); // Expected mean for Column 2
        assertEquals(62.26, stdDev, 0.01); // Expected standard deviation for Column 2
    }


}
