import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Number : ");
		num=sc.nextInt();
		
		if(num>0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Negative");
		}
		

	}

}
