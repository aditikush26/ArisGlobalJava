import java.util.Scanner;
public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num,sum=0,d;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number: ");
          num=sc.nextInt();
          
          while(num>0) {
        	  d=num%10;
        	  sum=sum+d;
        	  num=num/10;
          }
          System.out.println("Sum of digits: "+ sum);
	}

}
