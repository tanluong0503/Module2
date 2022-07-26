package Abstract_Interface.Resizeable;

public abstract class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {

    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public  String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "A Shape with color of "
                + getColor ()
                +" and "
                + (isFilled () ? "filled" : "not filled");
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle () {
            @Override
            public String howtoColor(String color) {
                return null;
            }
        };
        System.out.println(rectangle);

        rectangle = new Rectangle ( 2.3, 5.8 ) {
            @Override
            public String howtoColor(String color) {
                return null;
            }
        };
        System.out.println(rectangle);

        rectangle = new Rectangle ( 2.5, 3.8, "orange", true ) {
            @Override
            public String howtoColor(String color) {
                return null;
            }
        };
        System.out.println(rectangle);

    }

    public abstract void resize(double percent);

}
