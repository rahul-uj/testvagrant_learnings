package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AssignmentSorting {
    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Beth", 7, 4));
        students.add(new Student("Andy", 9, 6));
        students.add(new Student("Dev", 8, 5));
        students.add(new Student("Cindy", 12, 8));
        students.add(new Student("Earg", 9, 6));

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the class of student");
        int cl = scanner.nextInt();
        System.out.println("Students of class " + cl + " are as given in the below list");
        List<Student> collect1 = students.stream().filter(s -> s.getClassNo() == cl).toList();

        if (collect1 != null) {
            collect1.forEach(System.out::println);
        } else
            throw new RuntimeException("Students of " + cl + " not present");


        System.out.println("Enter the age of student");
        int age = scanner.nextInt();
        System.out.println("Students of age " + age + " are as given in the below list");
        List<Student> collect = students.stream().filter(s -> s.getAge() > age).toList();


        if (collect != null) {
            collect.forEach(System.out::println);
        } else
            throw new RuntimeException("Students of " + age + " not present");
    }

    public static class Student {
        private String name;
        private int age;
        private int classNo;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getClassNo() {
            return classNo;
        }

        public void setClassNo(int classNo) {
            this.classNo = classNo;
        }

        public Student(String name, int age, int classNo) {
            this.name = name;
            this.age = age;
            this.classNo = classNo;
        }

        @Override
        public String toString() {
            return "name = " + name +
                    ", age = " + age +
                    ", classNo = " + classNo;
        }
    }
}