package sjdm.gcu.model;

public class OrderModel {
	
	// Instantiate Private Variables for a product
	private String ID;
	private String orderNumber, productName;
	private float price;
	private int quantity;
	
	public OrderModel(String id, String orderNum, String pName, float p, int q){
		this.ID = id;
		this.orderNumber = orderNum;
		this.productName = pName;
		this.price = p;
		this.quantity = q;
	}
	
	// Public getters and setters
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
