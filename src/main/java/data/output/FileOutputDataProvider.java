package data.output;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOutputDataProvider implements OutputDataProvider<FileOutputParams> {


    @Override
    public void writeData(FileOutputParams params) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(params.getFileName()))) {
            for (String line : params.getLines()) {
                writer.write(line + " - " + params.getCountLines().get(line) + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Text has been sorted and saved to " + params.getFileName());
    }
}
