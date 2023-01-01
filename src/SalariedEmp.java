
public class SalariedEmp extends Employee {
	private double basic, bonus;
	
	public SalariedEmp() {
		super();
		this.basic = 0;
		this.bonus = 0;
	}
	public SalariedEmp(String name,String mobile,String dept, String desg, double basic, double bonus) {
		super(name, mobile, dept, desg);
		this.basic = basic;
		this.bonus = bonus;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getBasic() {
		return this.basic;
	}
	public double getBonus() {
		return this.bonus;
	}
	
	public String toString() {
		return super.toString() + "Basic: " + this.basic + "Bonus: " + this.bonus;
	}
}
