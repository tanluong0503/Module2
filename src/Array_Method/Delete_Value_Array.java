package Array_Method;

import java.util.Scanner;

public class Delete_Value_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        arr[0] = 6;
        arr[1] = 3;
        arr[2] = 8;
        arr[3] = 9;
        arr[4] = 5;
        arr[5] = 2;
        arr[6] = 4;
        arr[7] = 7;
        int size = arr.length;
        int n = 8;

        System.out.println("Trước khi xóa:");
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("Enter number");
        int number = scanner.nextInt();
        n = deleteElement(arr,n,number);
        System.out.println("Sau khi xóa");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int deleteElement (int [] arr, int n, int key) {
        int position = searchElement(arr,key);
        if (position == 1){
            System.out.println("Không tìm thấy : ");
        }
        for (int i = position; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }
    public static int searchElement (int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
