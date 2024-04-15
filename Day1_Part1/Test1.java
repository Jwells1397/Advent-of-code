
/*pseduo code - from te string you want a number let's call it X. X can be any either 1 or 2 digits.
the first digit of X will be the first number in the string, the second digit of X will be the last digit in the string.
If there's only one digit in the string, this will be X.

logic you can use:

example - hju8jhgs9ll5
X = 85

separate the numbers from the rest.

Then with the string of numbers, if string has only one character this is X, if it has more than one, print the first and the last only without a space.

so in example at this stage i'd have 879

find string.length.

if length = 1 then print index 0.
else 
print index (0) + index (string.length - 1)


*/ 

import java.io.*;
 
public class Test1 {
    public static void main(String[] args) {
/* so i need to create something which means that the input is a new line 
 * each time. maybe i could loop through the array of lines, where the input
 * starts with [0] and ends with the last line. maybe for 
 * (String element : processedLines). So have the other code create this array
 * and then here you would loop through these lines, creating the 1 or two digit
 * numbers and after we can sum them all.
 */


       // String input = "hghf8ued7nhe9";
        StringBuilder numbers = new StringBuilder();

        // Extract numbers from the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                numbers.append(ch);
            }
        }

        System.out.println("Numbers found: " + numbers.toString());

        // Additional logic using the numbers found string
        String numbersString = numbers.toString(); // Use the numbers found string
        int length = numbersString.length();

        if (length == 1) {
            System.out.println("Index 0: " + numbersString.charAt(0));
        } else {
            char firstIndex = numbersString.charAt(0);
            char lastIndex = numbersString.charAt(length - 1);
            System.out.println("" + firstIndex + lastIndex);
        }
    }
}

