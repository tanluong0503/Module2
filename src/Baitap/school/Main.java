package Baitap.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();
        Student student1 = new Student("luong", 19, "daklak", 12);
        Student student2 = new Student("tien", 19, "hue", 12);
        Student student3 = new Student("trung", 19, "hue", 12);
        Student student4 = new Student("loc", 23, "DN", 12);
        Student student5 = new Student("quy", 23, "dn", 12);
        Student student6 = new Student("thien", 20, "DN", 12);
        Student student7 = new Student("phap", 23, "DN", 12);
        Student student8 = new Student("thanh", 20, "dn", 12);

        school.add(student1);
        school.add(student2);
        school.add(student3);
        school.add(student4);
        school.add(student5);
        school.add(student6);
        school.add(student7);
        school.add(student8);

        school.getStudents20YearOld();
        school.countStudent23YearOldInDN();


        System.out.println(school.getStudents20YearOld());
        System.out.println();
        System.out.println(school.countStudent23YearOldInDN());

    }
}
