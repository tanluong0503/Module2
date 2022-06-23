package Abstract_Interface.animal;


import Abstract_Interface.edibler.Edibler;

public class Chicken extends Animal implements Edibler {

    @Override
    public String makeSound() {

        return "Chicken: cluck-cluck!";

    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
