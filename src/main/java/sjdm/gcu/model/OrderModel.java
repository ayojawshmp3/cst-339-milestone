package sjdm.gcu.model;

import org.springframework.data.annotation.Id;

/**
 * Model class representing an order.
 */
public class OrderModel {

    /**
     * Unique identifier.
     */
    @Id
    String id = "";

    /**
     * Order number.
     */
    String orderNo = "";

    /**
     * Product name.
     */
    String productName = "";

    /**
     * Price of the product.
     */
    float price = 0;

    /**
     * Quantity of the product.
     */
    int quantity = 0;

    /**
     * Default constructor.
     */
    public OrderModel() {
        this.id = "";
        this.orderNo = "";
        this.productName = "";
        this.price = 0;
        this.quantity = 0;
    }

    /**
     * Parameterized constructor.
     *
     * @param id         the order ID
     * @param orderNo    the order number
     * @param productName   the product name
     * @param price      the price of the product
     * @param quantity   the quantity of the product
     */
    public OrderModel(String id, String orderNo, String productName, float price, int quantity) {
        this.id = id;
        this.orderNo = orderNo;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Retrieves the order ID.
     *
     * @return the order ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the order ID.
     *
     * @param id the order ID to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Retrieves the order number.
     *
     * @return the order number
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Sets the order number.
     *
     * @param orderNo the order number to set
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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

