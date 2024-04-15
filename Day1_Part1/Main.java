import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static Integer Total_1 = 0;
    static Integer Total_2 = 0;
    static Integer Total_3 = 0;
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "C:\\Users\\44794\\Documents\\Image-Line\\FL Studio\\Projects\\Advent of code\\input1.txt";

        List<String> processedLines = new ArrayList<>();

        try {
            // Create a File object with the specified file path
            File file = new File(filePath);

            // Create a Scanner object to read from the file
            Scanner scanner = new Scanner(file);

            // Read input line by line until there are no more lines
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Process each line here
                processedLines.add(line);
                System.out.println("Processing line: " + line);
            }

            // Don't forget to close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.err.println("File not found: " + e.getMessage());
        }

        for (String input : processedLines) {
            System.out.println(input);
        }

        for (String input : processedLines) {

        
         // String input = "hghf8ued7nhe9";
         StringBuilder numbers = new StringBuilder();

         // Extract numbers from the input string
         for (int i = 0; i < input.length(); i++) {
             char ch = input.charAt(i);
             if (Character.isDigit(ch)) {
                 numbers.append(ch);
             }
         }
 
         //System.out.println(numbers.toString());
 
         // Additional logic using the numbers found string
         String numbersString = numbers.toString(); // Use the numbers found string
         int length = numbersString.length();
 // need to add each number output to a variable which keeps track of the total 
 //sum of the output numbers
         if (length == 1) {
             System.out.println(numbersString.charAt(0));
             char solo = numbersString.charAt(0);
             String calibration_string = ("" + solo);
             int calibration_one_value = 11*Integer.valueOf(calibration_string);
             Total_1 += calibration_one_value;
         } else {
             char firstIndex = numbersString.charAt(0);
             char lastIndex = numbersString.charAt(length - 1);
             System.out.println("" + firstIndex + lastIndex);
             String calibration_two_string = ("" + firstIndex + lastIndex);


             int calibration_value = Integer.valueOf(calibration_two_string);
             

             Total_2 += calibration_value;
         }
         Total_3 = Total_1 + Total_2;
        }
        System.out.println(Total_3);
    }
    
    
}

