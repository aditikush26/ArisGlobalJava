import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n,reverse=0, rem=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Input the number: ");
       n=sc.nextInt();
        int original=n;
       while(n!=0) {
    	   rem=n%10;
    	   reverse=reverse*10+rem;
    	   n/=10;
       }
       
       if(original==reverse) {
    	   System.out.println(original+" is a palindrome");
       }
       else {
    	   System.out.println(original+" is not a palindrome");
       }
	}

}
