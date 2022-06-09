package Loop;

import java.util.Scanner;

public class Show_Prime_MinHundred {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 100 ; i++) {
            int count = 0;
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.print(i + " ");

        }
    }
}
