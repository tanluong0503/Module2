package Loop;

import java.util.Scanner;

public class Show_Prime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i > 0; i++) {
            if (count <= 20) {
                int dem = 0;
                for (int j = 1; j <= i; j++)
                    if (i % j == 0)
                        dem++;
                if (dem == 2) {
                    System.out.print(i + " ");
                    count++;
                }
            }


        }

    }
}