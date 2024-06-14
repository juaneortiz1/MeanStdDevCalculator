package edu.escuelaing.arsw.ASE.app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Main application class to calculate mean and standard deviation
 * of columns from an specific input txt file
 */
public class App {
    /**
     * Main method to run the application.
     *
     * @param args: input file path.
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("How to use it: java -jar MeanStdDevCalculator.jar <input-file>");
            return;
        }

        String inputFilePath = args[0];

        try {
            List<LinkedList<Double>> columns = new ArrayList<>();
            Stream<String> lines = Files.lines(Paths.get(inputFilePath));

            List<String[]> data = lines.map(line -> line.split(" "))
                    .collect(Collectors.toList());

            if (!data.isEmpty()) {
                for (int i = 0; i < data.get(0).length; i++) {
                    columns.add(new LinkedList<>());
                }
            }

            for (String[] row : data) {
                for (int i = 0; i < row.length; i++) {
                    columns.get(i).add(Double.parseDouble(row[i]));
                }
            }

            for (int i = 0; i < columns.size(); i++) {
                LinkedList<Double> column = columns.get(i);
                double mean = MeanCalculator.calculateMean(column);
                double stdDev = StdDevCalculator.calculateStdDev(column, mean);

                System.out.println("Results for Column " + (i + 1) + ":");
                System.out.println("Mean: " + mean);
                System.out.println("Standard Deviation: " + stdDev);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
