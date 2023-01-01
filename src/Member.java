
public class Member extends Person {
	private String type;
	private double fees;
	public Member() {
		super();
		this.type = null;
		this.fees = 0;
		
	}
	public Member(String name, String mobile, String type, double fees) {
		super(name, mobile);
		this.type = type;
		this.fees = fees;
	}
	public String getMember() {
		return this.type;
	}
	public String toString() {
		return super.toString() + "Type: " + this.type + "Fees " + this.fees;
	}
}
