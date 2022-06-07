package task;

public class Task_MinimumEven {
    public static void main(String[] args) {
        int[] myArray = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int minValue = Integer.MAX_VALUE;

        System.out.print("■ Array: ");

        for (int i : myArray) {

            if (i > 0 && i % 2 == 0 && i < minValue)
                minValue = i;
            System.out.print(i + " ");

        }

        System.out.println("\n■ The minimum even positive number of array: " + minValue);
    }

}

