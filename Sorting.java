package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sorting {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(1);

        Iterator iterator = arrayList.iterator();
        System.out.println("Before Sorting");
        iterator.forEachRemaining(a -> System.out.print(a));
        Collections.sort(arrayList);
        System.out.println();
        System.out.println("After Sorting");

        Iterator iterator2 = arrayList.iterator();
        iterator2.forEachRemaining(b -> System.out.print(b));
        Collections.reverse(arrayList);
        System.out.println();
        System.out.println("Reversing the list");
        Iterator iterator3 = arrayList.iterator();
        iterator3.forEachRemaining(c -> System.out.print(c));
    }
}
