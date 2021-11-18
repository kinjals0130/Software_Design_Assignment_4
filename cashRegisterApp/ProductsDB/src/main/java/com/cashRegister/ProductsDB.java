package com.cashRegister;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Persistence storage of the products in a store
 */
public class ProductsDB {
    Product product = null;

    /**
     * Gets the product information for the product with the UPC code equal to UPCCode.
     *
     * @param UPCCode: barcode value
     */
    public Product GetProductInfo(int UPCCode) {
        try {
            File productDatabase = new File("src/ProductDatabase");
            Scanner myReader = new Scanner(productDatabase);

            while (myReader.hasNextLine()) {
                String[] product = myReader.nextLine().split(",");
                // Get the UPC code, name and price from the database
                int UPC = Integer.parseInt(product[0]);
                String name = product[1];
                double price = Double.parseDouble(product[2]);

                // Get product info if UPC codes are equal and only return a product if it's in the database
                if (UPCCode == UPC) {
                    this.product = new Product(UPC, name, price);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return product;
    }
}
