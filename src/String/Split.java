package String;

public class Split {
    public static void main(String[] args) {
        String s = "ab|cd|e";
        String[] result = s.split("\\|");

        for (String r : result)
            System.out.println(r);
    }
}
