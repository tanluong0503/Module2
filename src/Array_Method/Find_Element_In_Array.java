package Array_Method;

import java.util.Scanner;

public class Find_Element_In_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] champ = {"Yasuo", "Leesin", "Camile", "Senna", "Taliah", "Zed", "Nidalee", "Yone", "Zoe", "Katarina"};
        System.out.print("Enter a name's student: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < champ.length; i++) {
            if (champ[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }

    }


}



