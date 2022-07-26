package Abstract_Interface.add;

public class Test {
    public static void main(String[] args) {
        Animal bird= new AngryBird("Thien ");
        bird.toString();
        Animal bolt= new Bolt("Tien");
        bolt.toString();
        Animal nemo = new Nemo("Quy");
        nemo.toString();
    }


}
