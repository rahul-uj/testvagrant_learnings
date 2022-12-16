package collections;


import java.util.ArrayList;
import java.util.Collections;
public class CustomSortingInAL2 {

    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new Student(101, 81));
        arrayList.add(new Student(102, 95));
        arrayList.add(new Student(103, 66));
        arrayList.add(new Student(104, 78));

        Collections.sort(arrayList);

        arrayList.forEach(System.out::println);
    }
}

class Student implements  Comparable<Student>{

   private  int number;
   private  int marks;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student(int number, int marks) {
        this.number = number;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "number=" + number +
                ", marks=" + marks;
    }

    @Override
    public int compareTo(Student s) {
        return (this.getMarks() > s.getMarks()) ? -1 : ((this.getMarks() < s.getMarks()) ? 1 : 0);
    }
}
