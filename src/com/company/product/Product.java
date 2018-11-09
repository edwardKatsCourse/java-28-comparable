

package com.company.product;


public class Product implements Comparable<Product> {
    private String productName;
    private String sellerName;
    private Double price;

//    @Override
    public int compareTo(Product otherProduct) {
        int res =  productName
                .compareTo(otherProduct.getProductName());

        if (res == 0) {
            res = price.compareTo(otherProduct.getPrice());
        }

        return res;
    }

    public Product() {
    }

    public Product(String productName, String sellerName, Double price) {
        this.productName = productName;
        this.sellerName = sellerName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", price=" + price +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


}
