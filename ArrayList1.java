package collections;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);


        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(30);
        arrayList2.add(40);

        ArrayList arrayList1 = new ArrayList();
        arrayList1.addAll(arrayList);
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
    }

}
