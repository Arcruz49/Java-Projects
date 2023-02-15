import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	private Departament departament;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker(String name, WorkerLevel level, double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public String getName() {
		return name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
	public Departament getDepartament() {
		return departament;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	public double income (int year, int month){
		double total = this.baseSalary;
		Calendar calendar = Calendar.getInstance();
		for (HourContract c : contracts) {
			calendar.setTime(c.getDate());
			int c_year = calendar.get(Calendar.YEAR);
			int c_month = 1 + calendar.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
				total += c.totalValue();
			}
		}
		return total;
	}
}
