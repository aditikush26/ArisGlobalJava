import java.util.Scanner;
public class Maximum {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Num1 : ");
		num1=sc.nextInt();
		
		System.out.println("Num2: ");
		num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println("Num1 is maximum");
		}
		else {
			System.out.println("num2 is maximum");
		}
		
		

	}

}
