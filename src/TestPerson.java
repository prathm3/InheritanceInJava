import java.util.Scanner;

public class TestPerson {
	public static void main(String[] args) {
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("1.add Person \n2.Search by Name \n3.Search by id \n4.modify salary \n5.display all \n6.exit");
			System.out.println("\n\nEnter choice");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				int choice;
				System.out.println("1.Employee \n2.Member");
				choice = sc.nextInt();
				PersonService.addPerson(choice);
				break;
			case 2:
				String name;
				System.out.println("Enter Name:");
				name = sc.next();
				Person p = PersonService.searchByNameOrId(name);
				if(p != null) {
					System.out.println(p);
				}else {
					System.out.println("Not found");
				}
				break;
			case 3:
				String Id;
				System.out.println("Enter Id:");
				Id = sc.next();
				p= PersonService.searchByNameOrId(Id);
				if(p != null) {
					System.out.println(p);
				}else {
					System.out.println("Not found");
				}
				break;
			case 4:
				double bonus, basic;
				System.out.println("Enter basic");
				basic = sc.nextDouble();
				System.out.println("Enter bonus");
				bonus = sc.nextDouble();
				String IdorName;
				System.out.println("Enter Id or Name:");
				IdorName = sc.next();
				PersonService.modifySalaryByNameOrId(IdorName, basic, bonus);
				break;
			case 5:
				PersonService.displayAll();
				break;
			case 6:
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
			
		}while(ch != 6);
		
	}
}
