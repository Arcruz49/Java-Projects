import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private Date manufactDate;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM//yyyy");
	UsedProduct() {
	}
	
	UsedProduct(String name, double price, Date manufactDate){
		super(name,price);
		this.manufactDate = manufactDate;
	}
	public void setManufacDate(Date manufacDate) {
		this.manufactDate = manufacDate;
	}
	public Date getManufactDate() {
		return manufactDate;
	}
	
	@Override
	String priceTag() {
		
		return getName()+ " (used) $ "+ getPrice()+ 
				" (Manufacture date: " + getManufactDate()+")";
	}
}
