import java.util.Scanner;
public class Assignment2 {
	
	static boolean checkNumber(int n) {
		while(n%2==0) {
			n=n/2;
		}
		if(n==1) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter n: ");
        n=sc.nextInt();
        System.out.println(checkNumber(n));
	}

}
