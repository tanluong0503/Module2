package ProductManager;

public class Product {
    private long productID;
    private String productName;
    private int productQuantity;
    private double productPrice;

    public Product(
            long productID,
            String productName,
            int productQuantity,
            double productPrice
    ) {
        this.productID = productID;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public Product(String productName, int productQuantity, double productPrice) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public long getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return String.format("\n\tProduct Id: %s\n\tProduct Name: %s\n\tProduct Quantity: %s\n\tProduct Price: %s\n",
                productID,
                productName,
                productQuantity,
                productPrice
        );
    }
}
