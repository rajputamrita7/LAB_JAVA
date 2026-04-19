// 3b. String Exercise Programs
// Q1: Check if string is null or contains only whitespace using isNullOrEmpty()
// Q2: Count occurrences of substring using countOccurrences()
// Q3: Reverse string using reverseString()
// Q4: Check palindrome ignoring case and punctuation using isPalindrome()
// Q5: Remove all whitespace using removeWhitespace()

public class StringExercise3B {

    // Q1
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    // Q2
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    // Q3
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Q4
    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    // Q5
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {

        String str = "  Madam  ";
        String mainStr = "Java is fun, Java is powerful";
        String subStr = "Java";

        System.out.println("Original String: '" + str + "'");

        // Q1
        System.out.println("Is Null or Empty: " + isNullOrEmpty(str));

        // Q2
        System.out.println("Occurrences of 'Java': " + countOccurrences(mainStr, subStr));

        // Q3
        System.out.println("Reversed String: " + reverseString(str));

        // Q4
        System.out.println("Is Palindrome: " + isPalindrome(str));

        // Q5
        System.out.println("Without Whitespace: " + removeWhitespace(str));
    }
}