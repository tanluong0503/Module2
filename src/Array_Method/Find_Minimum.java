package Array_Method;

public class Find_Minimum {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minVaLue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    public static int minVaLue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }

        }
        return index;
    }
}
