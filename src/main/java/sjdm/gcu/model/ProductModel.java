package sjdm.gcu.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProductModel {
	
	@NotNull(message="A product name is a required field.")
	@Size(min=1, max=100, message="Must be between 1 and 100 characters.")
	private String productName;
	
	@NotNull(message="A price is a required field.")
	@Size(min=1, max=32, message="Must be between 1 and 32 characters.")
	private String price;
	
	@NotNull(message="Quantity is a required field.")
	@Size(min=1, max=32, message="Must be between 1 and 32 characters.")
	private String quantity;
	
	public ProductModel() {
	}

	public ProductModel(String productName, String price, String quantity) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getQuantity() {
		return quantity;
	}
	
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
