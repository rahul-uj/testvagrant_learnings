package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Remove {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("E");
        arrayList.add("F");
        System.out.println("Before Removing");
        System.out.println(arrayList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String you want to remove");
        String value = scanner.next();
       if(arrayList.contains(value)) {
           System.out.println(value+" present in the list");
           arrayList.remove(value);
           System.out.println("After Removing");
           System.out.println(arrayList);
       }
       else
           System.out.println(value+" not present");

    }
}
