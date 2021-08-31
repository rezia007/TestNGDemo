package csvoperation;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CsvUtils {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "src/test/java/csvoperation/data.csv";
        try {
            CSVReader csvReader = new CSVReader(new FileReader(filePath));
            List<String[]> reader = csvReader.readAll();
            System.out.println(reader.size());

            for (int i = 0; i < reader.size(); i++) {

                String[] record = reader.get(i);
                for (String str : record) {
                    System.out.println(str + ',');
                }
                System.out.println("\n");
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
