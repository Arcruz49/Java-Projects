public class importedProduct extends Product{
	private double customsFee;
	
	importedProduct(){
	}
	importedProduct(String name, double price, double customsFee){
		super(name,price);
		this.customsFee = customsFee;
	}
	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	public double getCustomsFee() {
		return customsFee;
	}
	
	@Override
	public double getPrice() {
		return super.getPrice() + getCustomsFee();
	}
	@Override
	String priceTag() {
		return getName() + " $ " + getPrice() + " Customs fee: $ " + getCustomsFee();
	}
	
	double totalPrice(){
		return getPrice()+getCustomsFee();
	}
	
}
