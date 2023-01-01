
public class Employee extends Person{
	private String dept, desg;
	public Employee() {
		super();
		this.dept = null;
		this.desg = null;
	}
	public Employee(String name,String mobile,String dept, String desg) {
		super(name,mobile);
		this.dept = dept;
		this.desg = desg;
		
	}
	public void setDept(String dept){
		this.dept = dept;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getDept() {
		return this.dept;
	}
	public String getDesg() {
		return this.desg;
	}
	public String toString() {
		return super.toString() + "dept: " + this.dept + "desg: " + this.desg;
	}
}
