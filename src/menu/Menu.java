package menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println(" * * * * * * * Menu * * * * * * *");
            System.out.println(" *                              *");
            System.out.println(" *   1. Quan li nguoi dung      *");
            System.out.println(" *   2. Quan li banh            *");
            System.out.println(" *   3. Quan li don dat hang    *");
            System.out.println(" *                              *");
            System.out.println(" * * * * * * ** * * * * * * * * *");
            System.out.print("Chon chuc nang: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println(" * * * * * * * USESNAME * * * * * * * * * *");
                    System.out.println(" *                                        *");
                    System.out.println(" *   1. Thong Tin Nguoi Dung              *");
                    System.out.println(" *   2. Them Thong Tin Nguoi Dung         *");
                    System.out.println(" *   3. Chinh Sua Thong Tin Nguoi Dung    *");
                    System.out.println(" *   4. Xoa Thong Tin Nguoi Dung          *");
                    System.out.println(" *   5. Cancel                            *");
                    System.out.println(" *                                        *");
                    System.out.println(" * * * * * * ** * * * * * * * * * * * * * *");
                    System.out.println("Chon chuc nang:");
                    choice = scanner.nextInt();
                    break;
                case 2:
                    System.out.println(" * * * * * * * CAKE * * * * * * * * * *   *");
                    System.out.println(" *                                        *");
                    System.out.println(" *   1. Thong Tin Banh                    *");
                    System.out.println(" *   2. Them Banh                         *");
                    System.out.println(" *   3. Chinh Sua Thong Tin Banh          *");
                    System.out.println(" *   4. Xoa Banh                          *");
                    System.out.println(" *   5. Cancel                            *");
                    System.out.println(" *                                        *");
                    System.out.println(" * * * * * * ** * * * * * * * * * * * * * *");
                    System.out.println("Chon chuc nang:");
                    choice = scanner.nextInt();
                    break;
                case 3:
                    System.out.println(" * * * * * * * ORDER * * * * * * * * * * *");
                    System.out.println(" *                                       *");
                    System.out.println(" *   1. Tao Order                        *");
                    System.out.println(" *   2. Hien thi danh sach order         *");
                    System.out.println(" *   3. Cancel                           *");
                    System.out.println(" *                                       *");
                    System.out.println(" *                                       *");
                    System.out.println(" *                                       *");
                    System.out.println(" * * * * * * ** * * * * * * * * * * * * **");
                    System.out.println("Chon chuc nang:");
                    choice = scanner.nextInt();
                    break;
            }
        }
    }
}
