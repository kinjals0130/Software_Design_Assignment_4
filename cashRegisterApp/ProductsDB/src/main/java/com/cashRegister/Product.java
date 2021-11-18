package com.cashRegister;

/**
 * Creates a Product object
 */
public class Product {
    private int UPCCode;
    private String name;
    private double price;

    /**
     * Sets the UPC code, name and price for current scanned product
     * @param UPCCode: barcode value
     * @param name: name of product
     * @param price: price of product
     */
    public Product(int UPCCode, String name, double price){
        this.UPCCode = UPCCode;
        this.name = name;
        this.price = price;
    }

    /**
     * Sets the UPC code for current scanned product
     * @param UPCCode: barcode value
     */
    public void setUPCCode(int UPCCode) {
        this.UPCCode = UPCCode;
    }

    /**
     * Returns the UPC code for current scanned product
     */
    public int getUPCCode() {
        return UPCCode;
    }

    /**
     * Represents the Product object info as a string
     */
    @Override
    public String toString() {
        return "Product{" +
                "UPCCode=" + UPCCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
