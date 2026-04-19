// 1b. Write a java program for getting different colors through ArrayList interface and perform the following operations:
// 1. Search whether the color "Red" is available or not
// 2. Remove the 2nd element and color "Blue" from the ArrayList
// 3. Sort the ArrayList using Collections.sort()
// 4. Extract the 1st and 2nd elements using SubList()
// 5. Delete nth element from the ArrayList using remove by index

import java.util.*;

public class ArrayListAllOperations {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        // Adding elements
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Original List: " + colors);

        // 1. Search "Red"
        if (colors.contains("Red")) {
            System.out.println("Red is available");
        } else {
            System.out.println("Red is not available");
        }

        // 2. Remove 2nd element and "Blue"
        colors.remove(1); // 2nd element
        colors.remove("Blue");
        System.out.println("After removing 2nd element and Blue: " + colors);

        // Add again for further operations
        colors.add("Red");
        colors.add("Blue");

        // 3. Sorting
        Collections.sort(colors);
        System.out.println("After sorting: " + colors);

        // 4. SubList (1st & 2nd)
        List<String> sub = colors.subList(0, 2);
        System.out.println("SubList (1st & 2nd): " + sub);

        // 5. Delete nth element
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index to delete: ");
        int n = sc.nextInt();

        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("After deleting index " + n + ": " + colors);
        } else {
            System.out.println("Invalid index");
        }

        sc.close();
    }
}