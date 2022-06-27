package Loop;

import java.util.Scanner;

public class Show_All_Kinds_Of_Pictures {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("menu.Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle ");
            System.out.println("3. Print isosceles triangle ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.Print the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;

                case 2:
                    System.out.println("2.Print the square triangle ");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    for (int i = 5; i > 0; i--) {
                        for (int j = 5 - i; j > 0; j--) {
                            System.out.print("  ");
                        }
                        for (int k = i; k > 0; k--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("3.Print isosceles triangle ");
                    for (int i = 0; i <= 6; i++) {
                        for (int space = 7; space >= 1; space--) {
                            System.out.println("");
                        }
                        for (int j = 0; j < i * 2 + 1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                case 0:
                    System.out.println("0.Exit");
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
