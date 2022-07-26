package Abstract_Interface.add;

public class Nemo extends Animal implements Swimable{
    public Nemo(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Boi bang duoi va vay");
    }

    @Override
    public String toString() {
        System.out.println(getName()+" is a fish ");
        swim();
        return super.toString();
    }

}
