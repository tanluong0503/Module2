package Baitap.transport;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Transport {
    Scanner scanner = new Scanner(System.in);
    private int id;
    private String manufacturer;
    private String year;
    private String price;
    private String color;

    private static final ArrayList<Transport> ListTransport = new ArrayList<>();

    public Transport() {
    }

    public Transport(int id, String manufacturer, String year, String price, String color) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", year='" + year + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

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

    }


    public void remove(){
        System.out.println("Chon id can xoa");
        int id = Integer.parseInt(scanner.nextLine());
        ListTransport .removeIf(temp -> id == temp.getId());
        System.out.println("xoa thanh cong");
    }

}
