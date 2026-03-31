package Collections.ListInterface;

import java.util.LinkedList;

public class FindNthElementFromEnd {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (list == null || list.isEmpty() || n <= 0) {
            throw new IllegalArgumentException("List cannot be null or empty, and n must be a positive integer.");
        }

      

        T[] array = (T[]) list.toArray(); 
        if (n > array.length) {
            throw new IllegalArgumentException("N is greater than the size of the list.");
        }
        return array[array.length - n];
    }

    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");

        int n1 = 2;
        System.out.println("Original List: " + list1 + ", N = " + n1);
        try {
            String nthElement1 = findNthFromEnd(list1, n1);
            System.out.println("Nth element from the end: " + nthElement1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);

        int n2 = 4;
        System.out.println("Original List: " + list2 + ", N = " + n2);
        try {
            Integer nthElement2 = findNthFromEnd(list2, n2);
            System.out.println("Nth element from the end: " + nthElement2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        LinkedList<Character> list3 = new LinkedList<>();
        list3.add('X');
        list3.add('Y');
        list3.add('Z');

        int n3 = 1;
        System.out.println("Original List: " + list3 + ", N = " + n3);
        try {
            Character nthElement3 = findNthFromEnd(list3, n3);
            System.out.println("Nth element from the end: " + nthElement3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        LinkedList<String> emptyList = new LinkedList<>();
        int n4 = 1;
        System.out.println("Original List: " + emptyList + ", N = " + n4);
        try {
            String nthElement4 = findNthFromEnd(emptyList, n4);
            System.out.println("Nth element from the end: " + nthElement4);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        LinkedList<String> singleElementList = new LinkedList<>();
        singleElementList.add("Only");
        int n5 = 1;
        System.out.println("Original List: " + singleElementList + ", N = " + n5);
        try {
            String nthElement5 = findNthFromEnd(singleElementList, n5);
            System.out.println("Nth element from the end: " + nthElement5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        LinkedList<String> list6 = new LinkedList<>();
        list6.add("A");
        list6.add("B");
        list6.add("C");

        int n6 = 5;
        System.out.println("Original List: " + list6 + ", N = " + n6);
        try {
            String nthElement6 = findNthFromEnd(list6, n6);
            System.out.println("Nth element from the end: " + nthElement6);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}