package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Rahul");
        arrayList.add("Rohan");
        arrayList.add("Rakshith");

        Iterator iterator = arrayList.iterator();
        iterator.forEachRemaining((ar ->System.out.println(ar)));


    }
}
