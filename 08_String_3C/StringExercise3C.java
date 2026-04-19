// 3c. String Exercise Programs
// Q6: Capitalize first letter of each word
// Q7: Truncate string with ellipsis
// Q8: Check if string is numeric
// Q9: Generate random string of given length
// Q10: Count number of words in a string

import java.util.*;

public class StringExercise3C {

    // Q6
    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return result.toString().trim();
    }

    // Q7
    public static String truncate(String str, int length) {
        if (str.length() <= length) return str;
        return str.substring(0, length) + "...";
    }

    // Q8
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    // Q9
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomStr = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            randomStr.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return randomStr.toString();
    }

    // Q10
    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {

        String str = "hello java programming world";
        String numStr = "12345";
        String sentence = "Java is very powerful language";

        // Q6
        System.out.println("Capitalized: " + capitalizeWords(str));

        // Q7
        System.out.println("Truncated: " + truncate(str, 10));

        // Q8
        System.out.println("Is Numeric: " + isNumeric(numStr));

        // Q9
        System.out.println("Random String: " + generateRandomString(8));

        // Q10
        System.out.println("Word Count: " + countWords(sentence));
    }
}