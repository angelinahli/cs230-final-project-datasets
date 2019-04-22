/**
 * filename: Reader.java
 * description: Takes a CSV datafile and converts it into a List of Maps 
 *              representing rows.
 * date: 04/08/19
 * @author Angelina Li
 *
 * NOTE: Do NOT modify this class.
 */

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Vector;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import fastcsv.*;

public class Reader {

    private final List<Map<String, String>> data;

    /**
     * Constructor for Reader class. Given a path to where a dataset is being
     * stored on your local machine, as well as a number of rows desired, will
     * create a List of Maps containing the first numRows rows in the dataset.
     *
     * Note that all data will be parsed as Strings -- you will have to convert
     * data to any specific types you would like independently.
     *
     * @param filepath - A filepath representing where the csv data file 
     *                   is kept. This can be either a relative or absolute filepath - 
     *                   e.g. "dataset.csv" or "Users/angie/Desktop/dataset.csv"
     * @param numRows -  The number of rows desired. Note that if you specify
     *                   more rows of data than exist in the dataset, you will
     *                   get the entire dataset.
     * @throws IOException if the filepath is invalid.
     */
    public Reader(String filepath, int numRows) throws IOException {
        this.data = new Vector<Map<String, String>>();

        File file = new File(filepath);
        CsvReader reader = new CsvReader();
        reader.setContainsHeader(true);

        // might throw IOException if your path is invalid
        CsvParser parser = reader.parse(file, StandardCharsets.UTF_8);
        
        CsvRow dataRow;
        int currentNumberRows = 0;
        while ( ((dataRow = parser.nextRow()) != null) && 
                currentNumberRows < numRows ) {
            this.data.add(dataRow.getFieldMap());
            currentNumberRows++;
        }
    }

    public final List<Map<String, String>> getDataset() {
        return this.data;
    }

    private static void printRowNicely(Map<String, String> map) {
        System.out.println("{");
        for(String key : map.keySet()) {
            System.out.println(String.format("    %s=%s;", key, map.get(key)));
        }
        System.out.println("}");
    }

    /**
     * Some starter code to help you understand how to import in data.
     */
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader(
            "../pantheon/pantheon.csv", 
            1000);
        List<Map<String, String>> dataset = reader.getDataset();
        System.out.println("first element:");
        printRowNicely(dataset.get(0));
        System.out.println("dataset size: " + dataset.size());
    }
}