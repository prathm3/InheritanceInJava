
public class Person {
	static int count;
	static {
		count = 0;
	}
	private String id,name,mobile;
	public Person() {
		this.id = "None" + count++;
		this.name = null;
		this.mobile = null;
	}
	public Person(String name, String mobile) {
		this.name = name;
		this.id = this.name.substring(0,3) + count++;
		this.mobile = mobile;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name ;
	}
	public String getId() {
		return this.id ;
	}
	public String getMobile() {
		return this.mobile;
	}
	public String toString() {
		return "id: "+ this.id + "Name " + this.name + "Mobile " + this.mobile; 
	}
}
