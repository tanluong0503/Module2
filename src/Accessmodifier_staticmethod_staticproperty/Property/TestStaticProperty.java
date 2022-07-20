package Accessmodifier_staticmethod_staticproperty.Property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Lamborghini", "V12");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("BMW", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
