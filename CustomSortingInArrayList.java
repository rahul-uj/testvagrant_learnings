package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSortingInArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(315);
        arrayList.add(167);
        arrayList.add(926);
        arrayList.add(743);
        arrayList.add(654);
        arrayList.add(331);


        Collections.sort(arrayList, (o1, o2) -> {
            return o1 % 10 > o2 % 10 ? 1 : -1;
        });
        arrayList.forEach(System.out::println);
    }
}
