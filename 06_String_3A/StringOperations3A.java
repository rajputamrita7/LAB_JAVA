// 3a. Develop a java program for performing various string operations with different string handling functions:
// String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching,
// Substring Operations, String Modification, Whitespace Handling, String Concatenation, String Splitting,
// StringBuilder Demo, String Formatting, Validate Email using contains(), startsWith() and endsWith()

import java.util.*;

public class StringOperations3A {
    public static void main(String[] args) {

        // String Creation
        String str = "  Welcome to Java Programming  ";
        System.out.println("Original String: '" + str + "'");

        // Length and Character Access
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 5: " + str.charAt(5));

        // String Comparison
        String str2 = "welcome to java programming";
        System.out.println("Equals: " + str.equals(str2));
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(str2));

        // String Searching
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // Substring
        System.out.println("Substring (2 to 10): " + str.substring(2, 10));

        // Modification
        System.out.println("UpperCase: " + str.toUpperCase());
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // Whitespace Handling
        String trimmed = str.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // Concatenation
        String concat = trimmed + " Course";
        System.out.println("Concatenated: " + concat);

        // Splitting
        String[] words = trimmed.split(" ");
        System.out.println("Split words:");
        for (String w : words) {
            System.out.println(w);
        }

        // StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("StringBuilder: " + sb);

        // Formatting
        String formatted = String.format("Name: %s, Marks: %d", "Amrita", 95);
        System.out.println("Formatted: " + formatted);

        // Email Validation
        String email = "student@gmail.com";
        if (email.contains("@") && email.startsWith("student") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}