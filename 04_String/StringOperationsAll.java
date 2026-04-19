// 2a. Develop a java program for performing various string operations with different string handling functions:
// String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching,
// Substring Operations, String Modification, Whitespace Handling, String Concatenation, String Splitting,
// StringBuilder Demo, String Formatting, Validate Email using contains(), startsWith() and endsWith()

import java.util.*;

public class StringOperationsAll {
    public static void main(String[] args) {

        // String Creation
        String str = "  Hello Java World  ";
        System.out.println("Original String: '" + str + "'");

        // Length and Character Access
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));

        // String Comparison
        String str2 = "hello java world";
        System.out.println("Equals: " + str.equals(str2));
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(str2));

        // String Searching
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // Substring Operations
        System.out.println("Substring (2 to 8): " + str.substring(2, 8));

        // String Modification
        System.out.println("To UpperCase: " + str.toUpperCase());
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // Whitespace Handling
        String trimmed = str.trim();
        System.out.println("Trimmed String: '" + trimmed + "'");

        // String Concatenation
        String concat = trimmed + " Programming";
        System.out.println("Concatenated: " + concat);

        // String Splitting
        String[] words = trimmed.split(" ");
        System.out.println("Split words:");
        for (String w : words) {
            System.out.println(w);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println("StringBuilder: " + sb);

        // String Formatting
        String formatted = String.format("Name: %s, Age: %d", "Amrita", 20);
        System.out.println("Formatted String: " + formatted);

        // Email Validation
        String email = "example@gmail.com";
        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}