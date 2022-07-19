package String;

public class IndexOf {
    public static void main(String[] args) {
        String a = "Luong";

        int i = a.indexOf("u");//1
        System.out.println(i);

        int j = a.indexOf("n");//3
        System.out.println(j);

        int k = a.indexOf("g",2);//4
        System.out.println(k);
    }
}
