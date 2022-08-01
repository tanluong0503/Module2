package Baitap.transport;

public class Car extends Transport {
    private String seat;
    private String engine;


    public Car() {
    }

    public Car(String seat, String engine) {
        this.seat = seat;
        this.engine = engine;
    }

    public Car(int id, String manufacturer, String year, String price, String color, String seat, String engine) {
        super(id, manufacturer, year, price, color);
        this.seat = seat;
        this.engine = engine;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void add() {
        System.out.println("Nhap ID");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap hang san xuat");
        String manufacturer = scanner.nextLine();

        System.out.println("Nhap nam san xuat");
        String year = scanner.nextLine();

        System.out.println("Nhap Gia");
        String price = scanner.nextLine();

        System.out.println("Nhap mau sac");
        String color = scanner.nextLine();

        System.out.println("Nhap so cho ngoi");
        String seat = scanner.nextLine();

        System.out.println("Nhap dong co");
        String engine = scanner.nextLine();

        Car car = new Car(id, manufacturer, year, price, color, seat, engine);
        System.out.println("Thêm thành công");
        System.out.println(car);
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + getId() + '\'' +
                "manufacturer=" + getManufacturer() + '\'' +
                "price=" + getPrice() + '\'' +
                "color=" + getColor() + '\'' +
                "seat='" + seat + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
