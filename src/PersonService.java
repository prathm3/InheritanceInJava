import java.util.Scanner;

public class PersonService {
	static Person[] parr;
	static int cnt;
	static {
		parr = new Person[5];
		cnt = 0;
	}
	public static void addPerson(int ch) {
		Scanner sc = new Scanner(System.in);
		if (parr != null) {
			while(parr[cnt] != null) {
				cnt++;
			}
		}
		if (cnt < parr.length) {
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter mobile no");
		String mobile = sc.next();
		if (ch == 1) {
			System.out.println("Enter dept");
			String dept = sc.next();
			System.out.println("Enter desg");
			String desg = sc.next();
			System.out.println("Entering Employee type...\n1.Salaried 2.Contract \n Please Choose");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("Enter basic");
				double basic = sc.nextDouble();
				System.out.println("Enter bonus");
				double bonus = sc.nextDouble();
				parr[cnt++] = new SalariedEmp(name, mobile, dept, desg, basic, bonus );
				System.out.println("salried emp added");
				
			}else if(choice == 2) {
				System.out.println("Enter no of hrs ");
				int noOfhrs = sc.nextInt();
				System.out.println("Enter price per hrs");
				double pricePerhrs = sc.nextDouble();
				parr[cnt++] = new ContractEmp(name, mobile, dept, desg, noOfhrs, pricePerhrs );
				System.out.println("Contract emp added");
			}else {
				System.out.println("Invalid ");
			}
		}else if(ch ==2) {
			System.out.println("Enter type");
			String type = sc.next();
			System.out.println("Enter fees");
			double fees = sc.nextDouble();
			parr[cnt++] = new Member(name, mobile, type, fees);
			System.out.println("Member added");
		} else {
			System.out.println("Invalid");
		}
		}
		
		
	}
	
	public static void displayAll() {
		for(int i= 0; i<= cnt; i++) {
			System.out.println(parr[i]);
		}
	}
	
	public static Person searchByNameOrId(String name) {
		int count = 0;
		while(count < cnt) {
			if ((parr[count]).getName().equals(name) ) {
				return parr[count];
			}
			count++;
		}
		return null;
	}
	public static void modifySalaryByNameOrId(String id,double basic, double bonus) {
	 Person p = PersonService.searchByNameOrId(id);
	 if(p != null) {
		 if(p instanceof SalariedEmp) {
			 ((SalariedEmp) p).setBasic(basic);
			 ((SalariedEmp) p).setBonus(bonus);
			 System.out.println("Modification done");
		 }
	 }else {
		 System.out.println("not found");
	 }
	}
}
