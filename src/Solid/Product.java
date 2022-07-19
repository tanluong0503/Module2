package Solid;



public class Product {
    private long productId;
    private String productName;
    private int productQuantity;
    private double productPrice;

    public Product(
            long productId,
            String productName,
            int productQuantity,
            double productPrice
    ) { this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }
    public long getProductId() {
        return productId;
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

    public void setProductId(long productId) {
        this.productId = productId;
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
        return String.format(
                "\n\tProduct Id: %s\n\tProduct Name: %s\n\tProduct Quantity: %s\n\tProduct Price: %s\n",

                productId,
                productName,
                productQuantity,
                productPrice
        );
    }


}
