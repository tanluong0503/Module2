package ProductManager;

import java.util.Scanner;

public class ProductView {

    private ProductService productService;
    private final Scanner Input = new Scanner(System.in);

    public ProductView() {
        productService = new ProductService();

    }


    public void showMenu() {
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
            String choice = Input.nextLine();
            switch (choice) {
                case "1":
                    showProducts();
                    break;

                case "2":
                    addProduct();
                    break;

                case "3":
                    editProduct();
                    break;
                case "4":
                    deleteProduct();
                    break;
                case "5":
                    findByName();
                    break;
                case "6":
//                    sortbyASC();
                    break;
            }
        }
    }


    public void showProducts() {
        System.out.printf(
                "\n\t%-16s%-36s%-26s%s\n\n",

                "Product Id",
                "Product Name",
                "Product Quantity",
                "Product Price"
        );
        for (Product product : productService.findAll()) {
            System.out.printf(
                    "\t%-16s %-36s %-26s%.2fđ\n",
                    product.getProductID(),
                    product.getProductName(),
                    product.getProductQuantity(),
                    product.getProductPrice()
            );
        }
        System.out.println();
    }

    public void showProductsASC() {
        System.out.printf("\n\t%-16s%-36s%-26s%s\n\n",

                "Product Id",
                "Product Name",
                "Product Quantity",
                "Product Price"
        );
        for (Product product : productService.sortByASC()) {
            System.out.printf(
                    "\t%-16s %-36s %-26s%.2fđ\n",

                    product.getProductID(),
                    product.getProductName(),
                    product.getProductQuantity(),
                    product.getProductPrice()
            );
        }

        System.out.println();
    }

    public void addProduct() {
        System.out.print("Type a product name: ");
        String productName = Input.nextLine();

        System.out.print("Type a product quantity: ");
        int productQuantity = Integer.parseInt(Input.nextLine());

        System.out.println("Type a product price: ");
        double productPrice = Double.parseDouble(Input.nextLine());
        Product newProduct = new Product(
                productName,
                productQuantity,
                productPrice
        );
        productService.addProduct(newProduct);
        System.out.println("\n■ Product added successfully!");
    }

    public void editProduct() {
        System.out.print("■ Type a product id to edit: ");
        int productId = Integer.parseInt(Input.nextLine());
        if (!productService.existsById(productId)) {
            System.out.println("San pham khong ton tai");
            return;
        }
        System.out.print("■ Type a new product name: ");
        String productName = Input.nextLine();
        System.out.print("■ Type a new product quantity:");
        int productQuantity = Integer.parseInt(Input.nextLine());
        System.out.print("■ Type a new product price: ");
        double productPrice = Double.parseDouble(Input.nextLine());

        Product newProduct = new Product(
                productId,
                productName,
                productQuantity,
                productPrice
        );
        productService.updateProduct(newProduct);
        System.out.println("\n■ Product edited successfully!");

    }

    public void deleteProduct() {
        System.out.print("Nhap id can xoa: ");
        int id = Integer.parseInt(Input.nextLine());
        productService.deleteProduct(id);
        System.out.println("Xoa Thanh Cong");
    }

    public void findByName() {
        System.out.print("Nhap name can tim kiem: ");
        String name  = (Input.nextLine());
        productService.findByName(name);
    }
}