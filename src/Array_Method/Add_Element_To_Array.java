package Array_Method;

import java.util.Arrays;
import java.util.Scanner;

public class Add_Element_To_Array {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            System.out.println("Enter elment:");
            int element = input.nextInt();
            System.out.println("Enter Index:");
            int index = input.nextInt();
            while (index < 0 || index > arr.length) {
                System.out.println("Position is out of array, please re-enter index: ");
                index = input.nextInt();
            }
            int[] temp = new int[11];
            for (int i = 0; i < temp.length; i++) {
                if (i < index)
                    temp[i] = arr[i];
                else if (i == index)
                    temp[i] = element;
                else
                    temp[i] = arr[i - 1];
            }
            arr = temp;
            System.out.printf("Result %s", Arrays.toString(arr));
        }
    }












