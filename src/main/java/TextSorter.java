import data.input.FileInputDataProvider;
import data.input.FileInputParams;
import data.input.InputDataProvider;
import data.output.FileOutputDataProvider;
import data.output.FileOutputParams;
import data.output.OutputDataProvider;
import sort.SortProvider;
import sort.SortingCriteriaFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class TextSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputDataProvider dataProvider = new FileInputDataProvider();
        OutputDataProvider outputDataProvider = new FileOutputDataProvider();

        while (true) {
            printMenu();
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                String additionalArgument;
                System.out.println("Enter file name: ");
                String inputFileName = scanner.next();

                System.out.println("In what file should I save the information?: ");
                String outputFileName = scanner.next();

                System.out.println("Sorting criteria: alphabet / length / word");
                String sortingCriterion = scanner.next();

                if (sortingCriterion.equals("word")) {
                    System.out.println("If sorting criteria = \"word\", then additional argument is the ordinal number " +
                            "of the word to sort in the line (numbering starts from 1)");
                    additionalArgument = scanner.next();
                } else {
                    additionalArgument = "1";
                }
                List<String> lines = dataProvider.readData(new FileInputParams(inputFileName));
                SortProvider sortProvider = SortingCriteriaFactory.criteriaFactory(sortingCriterion);
                sortProvider.sort(lines, additionalArgument);

                Map<String, Integer> lineCount = sumEqualsLines(lines);
                outputDataProvider.writeData(new FileOutputParams(outputFileName, lines, lineCount));
            } else if (userInput == 0) {
                System.out.println("Exit successfully");
                break;
            }
        }
    }

    private static Map<String, Integer> sumEqualsLines(List<String> lines) {
        Map<String, Integer> lineCount = new HashMap<>();
        for (String line : lines) {
            lineCount.put(line, lineCount.getOrDefault(line, 0) + 1);
        }
        return lineCount;
    }

    public static void printMenu() {
        System.out.println("What do you want to do?");
        System.out.println("1 - Sort file");
        System.out.println("0 - Exit the application.");
    }
}