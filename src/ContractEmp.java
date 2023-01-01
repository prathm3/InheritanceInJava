
public class ContractEmp extends Employee {
	private int noOfhrs;
	private double pricePerHrs;
	
	public ContractEmp() {
		super();
		this.noOfhrs = 0;
		this.pricePerHrs = 0;
	}
	public ContractEmp(String name,String mobile,String dept, String desg, int noOfhrs, double pricePerHrs) {
		super(name, mobile, dept, desg);
		this.noOfhrs = noOfhrs;
		this.pricePerHrs = pricePerHrs;
	}
	public void setNoOfhrs(int noOfhrs) {
		this.noOfhrs= noOfhrs;
	}
	public double getPricePerHrs() {
		return this.pricePerHrs;
	}
	public String toString() {
		return super.toString() + "NoOfHrs: " + this.noOfhrs + "pricePerHrs " + this.pricePerHrs;
	}
}
