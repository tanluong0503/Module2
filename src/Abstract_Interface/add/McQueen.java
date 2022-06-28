package Abstract_Interface.add;

public class McQueen extends Machine implements Runnable{
    public McQueen(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Bang 4 banh");
    }

    @Override
    public String toString() {
        System.out.println(getName()+" is a car ");
        run();
        return super.toString();
    }
}
