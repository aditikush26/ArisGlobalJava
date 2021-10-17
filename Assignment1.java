import java.util.Scanner;
public class Assignment1 {
	
	static int calculateSum(int n) {
		int S1,S2,S3;
		
		S1=((n/3)) *(2*3 + (n/3-1)*3)/2;
		S2=((n/5)) *(2*5 + (n/5-1)*5)/2;
		S3 = ((n/15)) * (2 * 15 + (n / 15 - 1) * 15) / 2;
		
		return S1+S2-S3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter value of n: ");
		 n=sc.nextInt();
		 System.out.println(calculateSum(n));

	}

}
