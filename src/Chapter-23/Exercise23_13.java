/*
    (Execution time for sorting)
    Write a program that obtains the execution time of selection sort, bubble sort,
    merge sort, quick sort, heap sort, and radix sort for input size 50,000, 100,000,
    150,000, 200,000, 250,000, and 300,000.

    @author: Eric Ramsey
    @version: 10/02/21

 */

import java.util.ArrayList;

public class Exercise23_13 {

    public static void main(String[] args) {

        System.out.print("|Array Size |Selection Sort|Bubble Sort |Merge Sort |Quick Sort |Heap Sort |Radix Sort |");

        for (int i = 50000; i <= 300000; i += 50000) {

            displayValue(i); // Call displayValue method to output final results

        }
    }
    // Method used to display the table of values
    public static void displayValue(int arraySize) {

        int columnWidth = 14;
        // Initialize int[] array that will store
        int[] list1 = new int[arraySize];

        for (int i = 0; i < list1.length; i++) {

            // Populate the array with a random int values
            list1[i] = (int)(Math.random() * 1000000);

        }
        System.out.print("\n|");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < columnWidth; j++) {
                System.out.print("-");
            }
            System.out.print("|");
        }
        System.out.printf("\n|%" + columnWidth + "d|", arraySize);

        // Call the selectionSort method, determine the execution time and display output
        int[] arrayOfNums = new int[arraySize];
        System.arraycopy(list1, 0, arrayOfNums, 0, list1.length);
        long startTime = System.currentTimeMillis();
        selectionSort(arrayOfNums);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.printf("%" + columnWidth + "d|", executionTime);

        // Call the bubbleSort method, determine the execution time and display output
        arrayOfNums = new int[arraySize];
        System.arraycopy(list1, 0, arrayOfNums, 0, list1.length);
        startTime = System.currentTimeMillis();
        bubbleSort(arrayOfNums);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.printf("%" + columnWidth + "d|", executionTime);

        // Call the mergeSort method, determine the execution time and display output
        arrayOfNums = new int[arraySize];
        System.arraycopy(list1, 0, arrayOfNums, 0, list1.length);
        startTime = System.currentTimeMillis();
        mergeSort(arrayOfNums);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.printf("%" + columnWidth + "d|", executionTime);

        // Call the quickSort method, determine the execution time and display output
        arrayOfNums = new int[arraySize];
        System.arraycopy(list1, 0, arrayOfNums, 0, list1.length);
        startTime = System.currentTimeMillis();
        quickSort(arrayOfNums);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.printf("%" + columnWidth + "d|", executionTime);

        // Call the heapSort method, determine the execution time and display output
        arrayOfNums = new int[arraySize];
        System.arraycopy(list1, 0, arrayOfNums, 0, list1.length);
        startTime = System.currentTimeMillis();
        heapSort(arrayOfNums);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.printf("%" + columnWidth + "d|", executionTime);

        // Call the radixSort method, determine the execution time and display output
        arrayOfNums = new int[arraySize];
        System.arraycopy(list1, 0, arrayOfNums, 0, list1.length);
        startTime = System.currentTimeMillis();
        radixSort(arrayOfNums, 1000000);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.printf("%" + columnWidth + "d|", executionTime);

    }
    // Method that uses Selection Sort Algorithm to sort elements in array
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    // Method that uses Bubble Sort Algorithm to sort elements in array
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    // Swap list[i] with list[i + 1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true; // Determines if there is still more elements to sort
                }
            }
        }
    }
    // Method that uses Merge Sort Algorithm to sort elements in array
    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            // Merge sort the first half
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            // Merge sort the second half
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0,
                    secondHalfLength);
            mergeSort(secondHalf);

            // Merge firstHalf with secondHalf into list
            merge(firstHalf, secondHalf, list);
        }
    }
    // Helper Method that uses Merge Sort Algorithm to sort elements in array
    public static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0; // Current index in list1
        int current2 = 0; // Current index in list2
        int current3 = 0; // Current index in temp

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2])
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }

        while (current1 < list1.length)
            temp[current3++] = list1[current1++];

        while (current2 < list2.length)
            temp[current3++] = list2[current2++];
    }
    // Method that uses Quick Sort Algorithm to sort elements in array
    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }
    // Helper Method that uses Quick Sort Algorithm to sort elements in array
    private static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }
    // Method used to partition or split the list left to right
    private static int partition(int[] list, int first, int last) {
        int pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search

        while (high > low) {
            // Search forward through the list from left
            while (low <= high && list[low] <= pivot)
                low++;

            // Search backward through the list from right
            while (low <= high && list[high] > pivot)
                high--;

            // Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while (high > first && list[high] >= pivot)
            high--;
        // Swap pivot with list[high]
        if (pivot > list[high]) {

            list[first] = list[high];
            list[high] = pivot;
            return high;

        } else {
            return first;
        }
    }
    // Method that uses the Radix Sort algorithm to sort the elements in an array
    static void radixSort(int[] list, int maxOrder) {
        for (int order = 1; order < maxOrder; order *= 10) {
            @SuppressWarnings("unchecked")
            ArrayList<Integer>[] bucket = new ArrayList[10];

            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new java.util.ArrayList();
            }

            for (int i = 0; i < list.length; i++) {
                bucket[(list[i] / order) % 10].add(list[i]);
            }

            int k = 0;
            for (int i = 0; i < bucket.length; i++) {
                if (bucket[i] != null) {
                    for (int j = 0; j < bucket[i].size(); j++)
                        list[k++] = bucket[i].get(j);
                }
            }
        }
    }
    // Method that uses the HeapSort Technique to sort the elements in an array
    public static void heapSort(int[] list) {
        // Create a Heap of integers
        Heap<Integer> heap = new Heap<Integer>();

        // Add elements to the heap
        for (int i = 0; i < list.length; i++) {

            heap.add(list[i]);

        }
        // Remove elements from the heap
        for (int i = list.length - 1; i >= 0; i--) {

            list[i] = heap.remove();

        }
    }
    // Heap Class
    static class Heap<E extends Comparable<E>> {

        private java.util.ArrayList<E> list = new java.util.ArrayList<E>();

        // Default heap object
        public Heap() {
        }
        // Method used to add objects to the heap
        public Heap(E[] objects) {

            for (E object : objects) {

                add(object);

            }
        }
        // Method used to add an object to the heap
        public void add(E newObject) {

            list.add(newObject); // Append the new object to heap
            int currentIndex = list.size() - 1; // The index of the last element

            while (currentIndex > 0) {
                int parentIndex = (currentIndex - 1) / 2;
                // Swap if the current object is greater than its parent
                if (list.get(currentIndex).compareTo(list.get(parentIndex)) > 0) {
                    E temp = list.get(currentIndex);
                    list.set(currentIndex, list.get(parentIndex));
                    list.set(parentIndex, temp);

                } else {

                    break;

                }
                currentIndex = parentIndex;
            }
        }
        // Method used to remove the root from the heap
        public E remove() {

            if (list.size() == 0)
                return null;

            E removedObject = list.get(0);
            list.set(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);

            int currentIndex = 0;
            while (currentIndex < list.size()) {

                int leftChildIndex = 2 * currentIndex + 1;
                int rightChildIndex = 2 * currentIndex + 2;

                // Determine the max index
                if (leftChildIndex >= list.size()) {

                    break; // Condition is met

                }
                int maxIndex = leftChildIndex;
                if (rightChildIndex < list.size()) {

                    if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0) {
                        maxIndex = rightChildIndex;
                    }
                }
                // Swap if the variable currentIndex is less than the maxIndex
                if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0) {
                    E temp = list.get(maxIndex);
                    list.set(maxIndex, list.get(currentIndex));
                    list.set(currentIndex, temp);
                    currentIndex = maxIndex;

                } else {

                    break;
                }
            }

            return removedObject;
        }
        // Constructor method used to return the size of heap
        public int getSize() {

            return list.size();

        }
    }
}