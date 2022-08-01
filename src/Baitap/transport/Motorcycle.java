package Baitap.transport;

public class Motorcycle extends Transport {
    private String wattage;

    public Motorcycle (){
    }

    public Motorcycle(String wattage) {
        this.wattage = wattage;
    }

    public Motorcycle(int id, String manufacturer, String year, String price, String color, String wattage) {
        super(id, manufacturer, year, price, color);
        this.wattage = wattage;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
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

        System.out.println("Nhap cong suat");
        String wattage = scanner.nextLine();

        Motorcycle motorcycle = new Motorcycle(id,manufacturer,year,price,color,wattage);
        System.out.println("Thêm thành công");
        System.out.println(motorcycle);

    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "id=" + getId() + '\'' +
                "manufacturer=" + getManufacturer() + '\'' +
                "price=" + getPrice() + '\'' +
                "color=" + getColor() + '\'' +
                "wattage='" + wattage + '\'' +
                '}';
    }



}
