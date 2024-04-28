package sjdm.gcu.model;

import org.springframework.data.annotation.Id;

public class WomensModel {
	
	// Instantiate Private Variables for a product
	@Id
	String id = "";
	String orderNo = "";
	String productName = "";
	float price = 0;
	int quantity = 0;
	
	public WomensModel() {
		this.id = "";
		this.orderNo = "";
		this.productName = "";
		this.price = 0;
		this.quantity = 0;
	}

	public WomensModel(String id, String orderNo, String productName, float price, int quantity){
		this.id = id;
		this.orderNo = orderNo;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
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