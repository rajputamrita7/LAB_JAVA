// 1c. Write a Java program using LinkedList to perform the following operations:
// 1. Iterate through all elements starting from 2nd position using iterator
// 2. Iterate the list in reverse order using descendingIterator()
// 3. Insert an element at the end using offerLast()
// 4. Display elements and their positions using get()
// 5. Swap first and third elements using Collections.swap()

import java.util.*;

public class LinkedListAllOperations {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Original List: " + list);

        // 1. Iterate from 2nd position
        System.out.println("\nIterating from 2nd position:");
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 2. Reverse iteration
        System.out.println("\nReverse iteration:");
        Iterator<String> rev = list.descendingIterator();
        while (rev.hasNext()) {
            System.out.println(rev.next());
        }

        // 3. Insert at end
        list.offerLast("Pink");
        System.out.println("\nAfter adding Pink at end: " + list);

        // 4. Display elements with position
        System.out.println("\nElements with positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + ": " + list.get(i));
        }

        // 5. Swap 1st and 3rd elements
        Collections.swap(list, 0, 2);
        System.out.println("\nAfter swapping 1st and 3rd elements: " + list);
    }
}