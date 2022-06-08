package Introduction;

import java.util.Scanner;

public class Currency_Conversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount USD:");
        usd = scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("VND value:" + quydoi);

    }
}
