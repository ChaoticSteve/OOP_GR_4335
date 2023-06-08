package Domen;

public class Product {
    private int productId;
    private String productName;
    private String productCategory;
    private double productPrice;
    public Product(int id, String name, String category, double price) {
        this.productId = id;
        this.productName = name;
        this.productCategory = category;
        this.productPrice = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String category) {
        this.productCategory = category;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double price) {
        if (price <= 0) throw new IllegalStateException(String.format("Цена указана некорректно!", price));
         else this.productPrice = price;
    }

    @Override
    public String toString() {
        return  "Name='" + productName + '\'' +
                ", Category='" + productCategory + '\'' +
                ", Price=" + productPrice;
    }
}
