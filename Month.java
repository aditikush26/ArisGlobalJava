import java.util.Scanner;
public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		Scanner sc=new Scanner(System.in);
		System.out.println("Month Number : ");
		month=sc.nextInt();
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			System.out.println("31 Days");
		}
		else if(month==4 || month==6 || month==9 || month==11) {
			System.out.println("30 Days");
		}
		else if(month==2) {
			System.out.println("28 Days");
		}
		else {
			System.out.println("Invalid month number");
		}
	}

}
