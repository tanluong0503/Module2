package inheritance;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public void defaultValue() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
        System.out.println(side1 + " " + side2 + " " + side3);
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super.setShape(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(double side1, double side2, double side3){
        this.side1=side1;
        this.side2 =side2;
        this.side3 =side3;
    }

    public Triangle() {
    }

    public double getSide1() {
        if (side1 <= 0) {
            System.out.println("side greathan 0");
            return 1.0;
        }
        return side1;
    }

    public void setSide1(double side1) {
        if (side1 <= 0) {
            System.out.println("side not less than or equal 0");
            return;
        }
        this.side1 = side1;
    }

    public double getSide2() {
        if (side2 <= 0) {
            System.out.println("side greathan 0");
            return 1.0;
        }
        return side2;
    }

    public void setSide2(double side2) {
        if (side2 <= 0) {
            System.out.println("side not less than or equal 0");
            return;
        }
        this.side2 = side2;
    }

    public double getSide3() {
        if (side3 <= 0) {
            System.out.println("size greathan 0");
            return 1.0;
        }
        return side3;
    }

    public void setSide3(double side3) {
        if (side3 <= 0) {
            System.out.println("side not less than or equal 0");
            return;
        }
        this.side3 = side3;
    }

    public void getSide() {
        getSide1();
        getSide2();
        getSide3();
    }

    public double getPerimeter() {
        getSide1();
        getSide2();
        getSide3();
        return side1 + side2 + side3;
    }

    public double getArea() {
        getSide1();
        getSide2();
        getSide3();
        double p = getPerimeter();
        double h = p / 2;
        double S = Math.sqrt(h * (h - side1) * (h - side2) * (h - side3));
        return Math.round(S * 100.00) / 100.00;
    }


    @Override
    public String toString() {
        if (side1 >= side2 + side3 || side2>= side1 + side3 || side3 >= side1+side2) {
            return "Triangle not true!";
        } else {
            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                return "side is not lessthan or equal 0";
            }
            String paragraph1 = "This triangle have side1 = " + getSide1() + ", side2 = " + getSide2() + ", side3 = " + getSide3() + ". ";
            String paragraph2 = "Area of triangle is: " + getArea() + " and Perimeter is: " + getPerimeter() + ".";
            String paragraph3 = " Color is: " + getColor() + " and filled is: " + isFilled();
            return paragraph1 + paragraph2 + paragraph3;
        }
    }

    public static void main(String[] args) {
        Triangle r1 = new Triangle(5,7,9);
        System.out.println(r1.getSide3());
        System.out.println(r1.toString());
    }
}