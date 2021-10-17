import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,n;
        System.out.println("Input terms: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        for(i=1;i<=n;i++) {
        	System.out.println("Number is "+ i + " and cube of this number is "+ (i*i*i));
        }
	}

}
