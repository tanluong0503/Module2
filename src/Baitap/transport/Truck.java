package Baitap.transport;

public class Truck extends Transport {
    private String tonnage;


    public Truck() {
    }

    public Truck(String tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(int id, String manufacturer, String year, String price, String color, String tonnage) {
        super(id, manufacturer, year, price, color);
        this.tonnage = tonnage;
    }

    public String getTonnage() {
        return tonnage;
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public void add (){
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

        System.out.println("Nhap trọng tải");
        String tonnage = scanner.nextLine();

        Truck truck = new Truck(id,manufacturer,year,price,color,tonnage);
        System.out.println("Thêm thành công");
        System.out.println(truck);


    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + getId() + '\'' +
                "manufacturer=" + getManufacturer() + '\'' +
                "price=" + getPrice() + '\'' +
                "color=" + getColor() + '\'' +
                "tonnage='" + tonnage + '\'' +
                '}';
    }
}
