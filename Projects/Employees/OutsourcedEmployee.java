public class OutsourcedEmployee extends Employee{
	private double additionalCharge;
	
	public OutsourcedEmployee() {
		
	}
	public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double additionalCharge){
		super(name,hours,valuePerHour);
		this.additionalCharge = additionalCharge;
		
	}
	
	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	public double getAdditionalCharge() {
		return additionalCharge;
	}
	@Override
	public double payment() {
		return (getValuePerHour() * getHours()) + (getAdditionalCharge() * 1.1);
	}
}
