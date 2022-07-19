package Solid;

import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;


public class ProductManagement {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final ArrayList<Product> PRODUCT_LIST = new ArrayList<>();


    public void defaultProduct() {
        PRODUCT_LIST.add(new Product(470503, "iPhone 14 Pro Max", 1400, 10));
        PRODUCT_LIST.add(new Product(470504, "iPhone XS Max ", 600, 20));
        PRODUCT_LIST.add(new Product(470505, "iPhone 12 ", 400, 17));
        PRODUCT_LIST.add(new Product(470506, "iPhone 12 Pro Max ", 1220, 11));
        PRODUCT_LIST.add(new Product(470507, "iPhone 13 ", 212, 30));
        PRODUCT_LIST.add(new Product(470508, "iPhone 11 Pro Max ", 310, 6));
        PRODUCT_LIST.add(new Product(470509, "iPhone 14 ", 190, 10));
        PRODUCT_LIST.add(new Product(470510, "iPhone X ", 2000, 18));
        PRODUCT_LIST.add(new Product(470511, "iPhone 11 ", 2021, 17));
        PRODUCT_LIST.add(new Product(470512, "iPhone 13 Pro Max", 1600, 14));
    }

    public void renderProduct() {
        System.out.printf(
                "\n\t%-16s%-36s%-26s%s\n\n",

                "Product Id",
                "Product Name",
                "Product Quantity",
                "Product Price"
        );
        for (Product temp : PRODUCT_LIST) {
            System.out.printf(
                    "\t%-16s %-36s %-26s%.2fđ\n",

                    temp.getProductId(),
                    temp.getProductName(),
                    temp.getProductQuantity(),
                    temp.getProductPrice()
            );
        }

        System.out.println();
    }

    public void addProduct() {
        renderProduct();
        long productId = (System.currentTimeMillis() % 100000);

        System.out.print("■ Type a product name: ");
        String productName = INPUT.nextLine();

        System.out.print("■ Type a product quantity: ");
        int productQuantity = Integer.parseInt(INPUT.nextLine());

        System.out.print("■ Type a product price: ");
        double productPrice = Double.parseDouble(INPUT.nextLine());

        PRODUCT_LIST.add(0, new Product(
                productId,
                productName,
                productQuantity,
                productPrice
        ));

        renderProduct();
        System.out.println("\n■ Product added successfully!");
    }

    public void editProduct() {
        renderProduct();

        System.out.print("■ Type a product id to edit: ");
        int productId = Integer.parseInt(INPUT.nextLine());

        for (Product temp : PRODUCT_LIST) {
            if (productId == temp.getProductId()) {
                System.out.print("■ Old product: \n" + temp + "\n■ Type a new product name: ");
                String newProductName = INPUT.nextLine();

                System.out.print("■ Type a new product quantity: ");
                int newProductQuantity = Integer.parseInt(INPUT.nextLine());

                System.out.print("■ Type a new product price: ");
                double newProductPrice = Double.parseDouble(INPUT.nextLine());

                temp.setProductName(newProductName);
                temp.setProductQuantity(newProductQuantity);
                temp.setProductPrice(newProductPrice);
            }
        }

        renderProduct();
        System.out.println("\n■ Product edited successfully!");
    }

    public void removeProduct() {
        renderProduct();

        System.out.print("■ Type a product id to remove: ");
        int productId = Integer.parseInt(INPUT.nextLine());

        PRODUCT_LIST.removeIf(temp -> productId == temp.getProductId());

        renderProduct();
        System.out.println("\n■ Product removed successfully!");
    }

    public void searchProductByName() {
        renderProduct();

        System.out.print("■ Type a product name to search: ");
        String productName = INPUT.nextLine().toLowerCase();

        System.out.println();

        for (Product temp : PRODUCT_LIST) {
            if (temp.getProductName().toLowerCase().contains(productName)) {
                System.out.printf(
                        "\t%-16s%-36s%-26s%.2fđ\n",

                        temp.getProductId(),
                        temp.getProductName(),
                        temp.getProductQuantity(),
                        temp.getProductPrice()
                );
            }
        }

        System.out.println();
    }

    class SortByPriceASC implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            double result = o1.getProductPrice() - o2.getProductPrice();
            if (result == 0) {
                return 0;
            }
            return result > 0 ? 1 : -1;
        }
    }

    public void compareProduct() {
        PRODUCT_LIST.sort(new SortByPriceASC());
    }

    class SortByPriceDESC implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            double result = o2.getProductPrice() - o1.getProductPrice();
            if (result == 0) {
                return 0;
            }
            return result > 0 ? 1 : -1;
        }
    }

    public void comparetorProduct() {
        PRODUCT_LIST.sort(new SortByPriceDESC());
    }


    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        productManagement.defaultProduct();

        while (true) {
            System.out.print(
                    "+----+----------+-----+-----------+----------+----------+----------+----------+----------+----------+------|\n" +
                            "|                                                                                                  |\n" +
                            "|                                       PRODUCT MANAGEMENT                                         |\n" +
                            "|                                          [Main Menu]                                             |\n" +
                            "|                                                                                                  |\n" +
                            "|           ■  [1] Product List - Hiển thị danh sách sản phẩm.                                     |\n" +
                            "|           ■  [2] Product Add - Thêm sản phẩm.                                                    |\n" +
                            "|           ■  [3] Product Edit - Chỉnh sửa sản phẩm.                                              |\n" +
                            "|           ■  [4] Product Remove - Xóa sản phẩm.                                                  |\n" +
                            "|           ■  [5] Product Search - Tìm kiếm sản phẩm trong danh sách.                             |\n" +
                            "|           ■  [6] SortByPriceASC - Sắp xếp giá theo thứ tự tăng dần.                              |\n" +
                            "|           ■  [7] SortByPriceDESC - Sắp xếp giá theo thứ tự giảm dần                              |\n" +
                            "|           ■  [8] Exit the application.                                                           |\n" +
                            "|                                                                                                  |\n" +
                            "+----+----------+-----+-----------+----------+----------+----------+----------+----------+---------|\n" +
                            "■ Type a number above by your choice: "
            );
            String choice = INPUT.nextLine();

            switch (choice) {
                case "1":
                    productManagement.renderProduct();
                    break;

                case "2":
                    productManagement.addProduct();
                    break;

                case "3":
                    productManagement.editProduct();
                    break;

                case "4":
                    productManagement.removeProduct();
                    break;

                case "5":
                    productManagement.searchProductByName();
                    break;

                case "6":
                    productManagement.compareProduct();
                    productManagement.renderProduct();
                    break;

                case "7":
                    productManagement.comparetorProduct();
                    productManagement.renderProduct();
                    break;

                case "8":
                    System.out.println("■ Exiting the application successfully!");
                    System.exit(2022);
                    break;

                default:
                    System.out.println("■ Invalid selected number, please try again!");
            }
        }
    }

}

