package OOP;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    public double getRoot1(double a, double b, double c) {
        double r1 = (-b + Math.sqrt(getDiscriminant(a, b, c))) / 2 * a;
        return r1;
    }

    public double getRoot2(double a, double b, double c) {
        double r2 = (-b - Math.sqrt(getDiscriminant(a, b, c))) / 2 * a;
        return r2;
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        if (quadraticEquation.getDiscriminant(1, 2, 1) > 0) {
            System.out.println("r1: " + quadraticEquation.getRoot1(1, 2, 1));
            System.out.println("r2: " + quadraticEquation.getRoot2(1, 2, 1));
        } else if (quadraticEquation.getDiscriminant(1, 2, 1) == 0) {
            System.out.println("r1" + quadraticEquation.getRoot1(1, 2, 1));
        } else {
            System.out.println("The equation has no roots");
        }

    }
}
