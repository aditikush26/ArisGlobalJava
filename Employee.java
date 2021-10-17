import java.util.Scanner;
public class Employee {
	String name;
	int empid;
	String contact;
	double salary;
	String department;
	char gender;
	String address;
	String designation;
	
	Employee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		name=sc.next();
		System.out.println("Enter employee id: ");
		empid=sc.nextInt();
		System.out.println("Enter contact Number: ");
		contact=sc.next();
		System.out.println("Enter salary: ");
		salary=sc.nextDouble();
		System.out.println("Enter Department: ");
		department=sc.next();
		System.out.println("Enter Gender: ");
		gender=sc.next().charAt(0);
		System.out.println("Enter address: ");
		address=sc.next();
		System.out.println("Enter Designation: ");
		designation=sc.next();
	}
	
	
	double calculateCommission(double percentage) {
		double commission=percentage/100*salary;
		return commission;
	}
	
	double calculateSalary(double commission) {
		salary=salary+commission;
		return salary;
	}
	
	void displayDetails() {
		System.out.println(name);
		System.out.println(empid);
		System.out.println(contact);
		System.out.println(salary);
		System.out.println(department);
		System.out.println(gender);
		System.out.println(address);
		System.out.println(designation);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(name);
		

	}

}


