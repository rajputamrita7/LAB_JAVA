// 1.a Develop a Java program for adding elements [Apple, Banana, Orange]
// into an ArrayList and a LinkedList and perform various operations.

import java.util.*;

public class ListOperations {
    public static void main(String[] args) {

        // ---------- ARRAYLIST ----------
        System.out.println("----- ARRAYLIST OPERATIONS -----");

        ArrayList<String> arrayList = new ArrayList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("After adding elements: " + arrayList);

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        System.out.println("After adding at index 1: " + arrayList);

        // 3. Adding multiple elements
        arrayList.addAll(Arrays.asList("Grapes", "Pineapple"));
        System.out.println("After adding multiple elements: " + arrayList);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + arrayList.get(2));

        // 5. Updating elements
        arrayList.set(0, "Green Apple");
        System.out.println("After updating: " + arrayList);

        // 6. Removing elements
        arrayList.remove("Banana");
        System.out.println("After removing Banana: " + arrayList);

        // 7. Searching elements
        System.out.println("Contains Orange? " + arrayList.contains("Orange"));

        // 8. List size
        System.out.println("Size: " + arrayList.size());

        // 9. Iterating over list
        System.out.println("Iterating using for-each:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        // 10. Using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        System.out.println("After sorting: " + arrayList);

        // 12. Sublist
        System.out.println("Sublist (0 to 2): " + arrayList.subList(0, 2));

        // 13. Clearing list
        arrayList.clear();
        System.out.println("After clearing: " + arrayList);



        // ---------- LINKEDLIST ----------
        System.out.println("\n----- LINKEDLIST OPERATIONS -----");

        LinkedList<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        System.out.println("After adding elements: " + linkedList);

        // 2. Adding element at specific index
        linkedList.add(1, "Mango");
        System.out.println("After adding at index 1: " + linkedList);

        // 3. Adding multiple elements
        linkedList.addAll(Arrays.asList("Grapes", "Pineapple"));
        System.out.println("After adding multiple elements: " + linkedList);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + linkedList.get(2));

        // 5. Updating elements
        linkedList.set(0, "Green Apple");
        System.out.println("After updating: " + linkedList);

        // 6. Removing elements
        linkedList.remove("Banana");
        System.out.println("After removing Banana: " + linkedList);

        // 7. Searching elements
        System.out.println("Contains Orange? " + linkedList.contains("Orange"));

        // 8. List size
        System.out.println("Size: " + linkedList.size());

        // 9. Iterating over list
        System.out.println("Iterating using for-each:");
        for (String item : linkedList) {
            System.out.println(item);
        }

        // 10. Using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> it2 = linkedList.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        // 11. Sorting
        Collections.sort(linkedList);
        System.out.println("After sorting: " + linkedList);

        // 12. Sublist
        System.out.println("Sublist (0 to 2): " + linkedList.subList(0, 2));

        // 13. Clearing list
        linkedList.clear();
        System.out.println("After clearing: " + linkedList);
    }
}