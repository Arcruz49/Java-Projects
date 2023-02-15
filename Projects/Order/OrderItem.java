public class OrderItem {
	private Integer quantity;
	private double price;
	
	private Product product;
	
	public OrderItem (Integer quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
		
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public double subTotal () {
		return getPrice() * getQuantity();
	}
	
	public String toString() {
		return getProduct().getName() + ", " + getPrice() + ", Quantity: "
	+  getQuantity() + ", Subtotal: " + subTotal(); 
	}
}
