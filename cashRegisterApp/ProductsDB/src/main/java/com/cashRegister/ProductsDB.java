package com.cashRegister;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Persistence storage of the products in a store
 */
public class ProductsDB {
    /**
     * Gets the product information for the product with the UPC code equal to UPCCode.
     *
     * @param UPCCode: barcode value
     */
    public static Product GetProductInfo(String UPCCode) {
        Product item = null;
        try {
            File productDatabase = new File("ProductsDB/src/main/java/com/cashRegister/Products");
            Scanner myReader = new Scanner(productDatabase);

            while (myReader.hasNextLine()) {
                String[] product = myReader.nextLine().split(",");
                // Get the UPC code, name and price from the database
                String name = product[1];
                double price = Double.parseDouble(product[2]);

                // Get product info if UPC codes are equal and only return a product if it's in the database
                if (UPCCode.equals(product[0])) {
                    item = new Product(product[0], name, price);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return item;
    }
}
