/*
    Write a program that creates two priority queues,
    {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and
    {"George", "Katie", "Kevin", "Michelle", "Ryan"} and displays
    their union, difference, and intersection. Note that the priority
    queue can have duplicates. The union of two priority queues may have duplicates.

    @author: Eric Ramsey
    @version: 10/09/2021
 */

import java.util.PriorityQueue;

public class Exercise20_10 {

    public static void main(String[] args) {

        // Initialize two Priority Queue's and add required elements
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.add("George");
        priorityQueue1.add("Jim");
        priorityQueue1.add("John");
        priorityQueue1.add("Blake");
        priorityQueue1.add("Kevin");
        priorityQueue1.add("Michael");
        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.add("George");
        priorityQueue2.add("Katie");
        priorityQueue2.add("Kevin");
        priorityQueue2.add("Michelle");
        priorityQueue2.add("Ryan");

        // Final Output
        System.out.println("The unioin of the two priority queue is "
                + priorityQueueUnion(priorityQueue1, priorityQueue2));
        System.out.println("The difference of the two priority queue is "
                + priorityQueueDifference(priorityQueue1, priorityQueue2));
        System.out.println("The intersection of the two priority queue is "
                + priorityQueueIntersection(priorityQueue1, priorityQueue2));
    }
    // Method that returns the unification of the two Priority Queue elements
    public static <E> PriorityQueue<E> priorityQueueUnion(PriorityQueue<E> priorityQueue1,
                                                          PriorityQueue<E> priorityQueue2) {

        PriorityQueue<E> priorityQueueUnion = new PriorityQueue<>(priorityQueue1);
        priorityQueueUnion.addAll(priorityQueue2);

        return priorityQueueUnion;
    }
    // Method that returns the difference of the two Priority Queue elements
    public static <E> PriorityQueue<E> priorityQueueDifference(PriorityQueue<E> priorityQueue1,
                                                          PriorityQueue<E> priorityQueue2) {

        PriorityQueue<E> priorityQueueDifference = new PriorityQueue<>(priorityQueue1);
        priorityQueueDifference.removeAll(priorityQueue2);

        return priorityQueueDifference;
    }
    // Method that returns the intersection of the two Priority Queue elements
    public static <E> PriorityQueue<E> priorityQueueIntersection(PriorityQueue<E> priorityQueue1,
                                                               PriorityQueue<E> priorityQueue2) {

        PriorityQueue<E> priorityQueueIntersection = new PriorityQueue<>(priorityQueue1);
        priorityQueueIntersection.retainAll(priorityQueue2);

        return priorityQueueIntersection;
    }
}