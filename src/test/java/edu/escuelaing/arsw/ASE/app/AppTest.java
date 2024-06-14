package edu.escuelaing.arsw.ASE.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;


import static org.junit.Assert.assertEquals;

public class AppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        // Redirect standard output to capture console output
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Restore original standard output
        System.setOut(originalOut);
    }

    @Test
    public void testAppWithColumnNumbersFile() throws IOException {
        String inputFilePath = "src/test/resources/columnNumbers.txt";
        App.main(new String[]{inputFilePath});


        String printedOutput = outContent.toString().trim();

        String[] lines = printedOutput.split(System.lineSeparator());

        assertEquals("Results for Column 1:", lines[0].trim());
        assertEquals("Mean: 553.6", lines[1].trim());
        assertEquals("Standard Deviation: 572.5330072969108", lines[2].trim());

        assertEquals("Results for Column 2:", lines[3].trim());
        assertEquals("Mean: 60.32000000000001", lines[4].trim());
        assertEquals("Standard Deviation: 62.25583060601187", lines[5].trim());
    }
}
