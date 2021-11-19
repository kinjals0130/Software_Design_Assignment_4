package com.cashRegister;

/**
 * Creates a Product object
 */
public class Product {
    private String UPCCode;
    private String name;
    private double price;

    /**
     * Sets the UPC code, name and price for current scanned product
     * @param UPCCode: barcode value
     * @param name: name of product
     * @param price: price of product
     */
    public Product(String UPCCode, String name, double price){
        this.UPCCode = UPCCode;
        this.name = name;
        this.price = price;
    }

    /**
     * Sets the UPC code for current scanned product
     * @param UPCCode: barcode value
     */
    public void setUPCCode(String UPCCode) {
        this.UPCCode = UPCCode;
    }

    /**
     * Returns the UPC code for current scanned product
     */
    public String getUPCCode() {
        return UPCCode;
    }

    /**
     * Represents the Product object info as a string
     */
    @Override
    public String toString() {
        return name + ":" + " $" + price;
    }
}
