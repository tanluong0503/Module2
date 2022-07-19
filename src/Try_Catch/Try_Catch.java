package Try_Catch;

public class Try_Catch {
    public static void main(String[] args) {
        int x = 0;
        int y = 10;
        try {
            int num = x/y;
            System.out.println("next-statement: Inside try block");
        }catch (Exception ex){
            System.out.println("Exception Occurred");
        }
        System.out.println("next-statement: Outside of try-catch");
    }
}
