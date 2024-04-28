package sjdm.gcu.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Model class representing a product.
 */
public class ProductModel {

    /**
     * Product name.
     */
    @NotNull(message="A product name is a required field.")
    @Size(min=1, max=100, message="Must be between 1 and 100 characters.")
    private String productName;

    /**
     * Price of the product.
     */
    @NotNull(message="A price is a required field.")
    @Size(min=1, max=32, message="Must be between 1 and 32 characters.")
    private String price;

    /**
     * Quantity of the product.
     */
    @NotNull(message="Quantity is a required field.")
    @Size(min=1, max=32, message="Must be between 1 and 32 characters.")
    private String quantity;

    /**
     * Default constructor.
     */
    public ProductModel() {
    }

    /**
     * Parameterized constructor.
     *
     * @param productName the product name
     * @param price the price of the product
     * @param quantity the quantity of the product
     */
    public ProductModel(String productName, String price, String quantity) {
        super();
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Retrieves the product name.
     *
     * @return the product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the product name.
     *
     * @param productName the product name to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Retrieves the price of the product.
     *
     * @return the price of the product
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the price of the product.
     *
     * @param price the price of the product to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * Retrieves the quantity of the product.
     *
     * @return the quantity of the product
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product.
     *
     * @param quantity the quantity of the product to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}

