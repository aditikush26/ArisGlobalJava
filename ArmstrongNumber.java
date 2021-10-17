import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num,originalNumber,rem,result=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number : ");
       num=sc.nextInt();
       originalNumber=num;
        while(originalNumber!=0) {
        	rem=originalNumber%10;
        	result+=Math.pow(rem, 3);
        	originalNumber=originalNumber/10;
        }
        
        if(result==num) {
        	System.out.println(num + " is an armstrong number");
        }
        else {
        	System.out.println(num + " is not an armstrong number");
        }
	}

}
