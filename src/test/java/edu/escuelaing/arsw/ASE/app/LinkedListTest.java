package edu.escuelaing.arsw.ASE.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testAdd() {
        LinkedList<Double> list = new LinkedList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);

        int index = 0;
        Double[] expectedValues = {1.0, 2.0, 3.0};
        for (Double value : list) {
            assertEquals(expectedValues[index], value);
            index++;
        }
    }

    @Test
    public void testSize() {
        LinkedList<Double> list = new LinkedList<>();
        assertEquals(0, list.size());

        list.add(1.0);
        list.add(2.0);
        list.add(3.0);

        assertEquals(3, list.size());
    }

    @Test
    public void testIsEmpty() {
        LinkedList<Double> list = new LinkedList<>();
        assertEquals(0, list.size());

        list.add(1.0);
        assertEquals(1, list.size());
    }

    @Test
    public void testIterator() {
        LinkedList<Double> list = new LinkedList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);

        Double[] expectedValues = {1.0, 2.0, 3.0};
        int index = 0;
        for (Double value : list) {
            assertEquals(expectedValues[index], value);
            index++;
        }
    }
}
