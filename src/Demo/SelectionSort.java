package Demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SelectionSort {

    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void selectionSort() {

    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64, 25, 12, 22, 11};
        System.out.println("Mảng ban đầu:");
        ob.printArray(arr);
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
        Student st1 = new Student("Luong", 19, "Nam");
        Student st2 = new Student("Tien", 19, "Nam");
        Student st3 = new Student("Loc", 35, "Nam");
        Student st4 = new Student("Tri", 31, "Nam");
        Student st5 = new Student("Phuoc", 16, "Nam");
        Student st6 = new Student("Ngan", 22, "Nu");
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);

    }
}
