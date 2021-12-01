/*
    (Perform set operations on hash sets) Create two linked hash sets
    {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and {"George", "Katie", "Kevin", "Michelle", "Ryan"}
    and find their union, difference, and intersection. (You can clone the sets to preserve the original sets from
    being changed by these set methods.)

    @author: Eric Ramsey
    @version: 10/19/2021
 */

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Exercise21_01 {

    public static void main(String[] args) {

        // Initialize two Priority Queue's and add required elements
        HashSet<String> hashSet1 = new LinkedHashSet<>();
        hashSet1.add("George");
        hashSet1.add("Jim");
        hashSet1.add("John");
        hashSet1.add("Blake");
        hashSet1.add("Kevin");
        hashSet1.add("Michael");
        HashSet<String> hashSet2 = new LinkedHashSet<>();
        hashSet2.add("George");
        hashSet2.add("Katie");
        hashSet2.add("Kevin");
        hashSet2.add("Michelle");
        hashSet2.add("Ryan");

        // Final Output
        System.out.println("The union of the two priority queue is "
                + hashSetUnion(hashSet1, hashSet2));
        System.out.println("The difference of the two priority queue is "
                + hashSetDifference(hashSet1, hashSet2));
        System.out.println("The intersection of the two priority queue is "
                + hashSetIntersection(hashSet1, hashSet2));
    }
    // Method that returns the unification of the two HashSet elements
    public static <E> HashSet<E> hashSetUnion(HashSet<E> hashSet1,
                                                    HashSet<E> hashSet2) {

        HashSet<E> hashSetUnion = new LinkedHashSet<>(hashSet1);
        hashSetUnion.addAll(hashSet2);

        return hashSetUnion;
    }
    // Method that returns the difference of the two HashSet elements
    public static <E> HashSet<E> hashSetDifference(HashSet<E> hashSet1,
                                                               HashSet<E> hashSet2) {

        HashSet<E> hasSetDifference = new LinkedHashSet<>(hashSet1);
        hasSetDifference.removeAll(hashSet2);

        return hasSetDifference;
    }
    // Method that returns the intersection of the two HashSet elements
    public static <E> HashSet<E> hashSetIntersection(HashSet<E> hashSet1,
                                                                 HashSet<E> hashSet2) {

        HashSet<E> hashSetIntersection = new LinkedHashSet<>(hashSet1);
        hashSetIntersection.retainAll(hashSet2);

        return hashSetIntersection;
    }
}
