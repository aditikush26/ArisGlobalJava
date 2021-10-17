import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a,b,i,hcf=0;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the first number: ");
          a=sc.nextInt();
          System.out.println("Enter the second number: ");
          b=sc.nextInt();
          
          
          for(i=1;i<=a || i<=b;i++) {
        	  if(a%i==0 && b%i==0) {
        		  hcf=i;
        	  }
          }
          System.out.println("hcf of two numbers: "+hcf);
	}

}
