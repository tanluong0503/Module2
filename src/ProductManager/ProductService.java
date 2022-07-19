package ProductManager;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(470503, "iPhone 14 Pro Max", 1400, 10));
        products.add(new Product(470504, "iPhone XS Max ", 600, 20));
        products.add(new Product(470505, "iPhone 12 ", 400, 17));
        products.add(new Product(470506, "iPhone 12 Pro Max ", 1220, 11));
        products.add(new Product(470507, "iPhone 13 ", 212, 30));
        products.add(new Product(470508, "iPhone 11 Pro Max ", 310, 6));
        products.add(new Product(470509, "iPhone 14 ", 190, 10));
        products.add(new Product(470510, "iPhone X ", 2000, 18));
        products.add(new Product(470511, "iPhone 11 ", 2021, 17));
        products.add(new Product(470512, "iPhone 13 Pro Max", 1600, 14));
    }

    public List<Product> findAll() {
        return products;
    }

    public void addProduct(Product newProduct) {
        newProduct.setProductID(System.currentTimeMillis() / 1000);
        findAll().add(newProduct);
    }

    public void updateProduct(Product newProduct) {
        for (Product product : findAll()) {
            if (product.getProductID() == newProduct.getProductID()) {
                String productName = newProduct.getProductName();
                if (productName != null)
                    product.setProductName(productName);
                double productPrice = newProduct.getProductPrice();
                if (productPrice != 0)
                    product.setProductPrice(productPrice);
                int productQuantity = newProduct.getProductQuantity();
                if (productQuantity != 0)
                    product.setProductQuantity(productQuantity);
                break;
            }
        }
    }

    public boolean existsById(int productID) {
        for (Product product : findAll()) {
            if (product.getProductID() == productID)
                return true;
        }
        return false;
    }

    public void deleteProduct(long id) {
        for (Product product : findAll()) {
            if (id == product.getProductID()) {
                products.remove(product);
                break;
            }
        }
    }

    public Product findByName(String name) {
        for (Product product : findAll()) {
            if (name.equals(product.getProductID()))
                return product;

        }
        return null;
    }


    public List<Product> sortByASC() {
        List<Product> newProduct = new ArrayList<>(findAll());
        newProduct.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getProductPrice() - o2.getProductPrice());
            }
        });
        return newProduct;
    }

//    public List<Product> sortByDESC() {
//        List<Product> newProduct = new ArrayList<>(findAll());
//        newProduct.sort(new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return (int) (o2.getProductPrice() - o1.getProductPrice());
//            }
//        });
//        return newProduct;
//    }
}