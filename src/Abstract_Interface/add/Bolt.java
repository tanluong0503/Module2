package Abstract_Interface.add;

public class Bolt extends Animal implements Barkable, Runnable{
    public Bolt(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("chay bang 4 chan ");
    }

    @Override
    public void bark() {
        System.out.println("Gaww gaww gaww .....");
    }

    @Override
    public String toString() {
        System.out.print(getName()+" is a dog \n");
        run();
        bark();
        return super.toString();
    }

}
