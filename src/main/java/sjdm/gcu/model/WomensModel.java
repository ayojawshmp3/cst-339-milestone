package sjdm.gcu.model;

import org.springframework.data.annotation.Id;

/**
 * Model class representing women's products.
 */
public class WomensModel {

    // Instantiate Private Variables for a product
    @Id
    String id = "";
    String orderNo = "";
    String productName = "";
    float price = 0;
    int quantity = 0;

    /**
     * Default constructor.
     */
    public WomensModel() {
        this.id = "";
        this.orderNo = "";
        this.productName = "";
        this.price = 0;
        this.quantity = 0;
    }

    /**
     * Parameterized constructor.
     *
     * @param id the ID of the product
     * @param orderNo the order number of the product
     * @param productName the name of the product
     * @param price the price of the product
     * @param quantity the quantity of the product
     */
    public WomensModel(String id, String orderNo, String productName, float price, int quantity){
        this.id = id;
        this.orderNo = orderNo;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Retrieves the ID of the product.
     *
     * @return the ID of the product
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of the product.
     *
     * @param id the ID of the product to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves the order number of the product.
     *
     * @return the order number of the product
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Sets the order number of the product.
     *
     * @param orderNo the order number of the product to set
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * Retrieves the name of the product.
     *
     * @return the name of the product
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the name of the product.
     *
     * @param productName the name of the product to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Retrieves the price of the product.
     *
     * @return the price of the product
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the price of the product.
     *
     * @param price the price of the product to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Retrieves the quantity of the product.
     *
     * @return the quantity of the product
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product.
     *
     * @param quantity the quantity of the product to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
