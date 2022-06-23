package Abstract_Interface.animal;

import Abstract_Interface.edibler.Edibler;


public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edibler edibler = (Edibler) animal;
                System.out.println(edibler.howtoEat());
            }

        }

    }
}
