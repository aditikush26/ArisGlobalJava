import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        
        int current=num%10;
        num=num/10;
        
        while(num>0) {
        	if(current<=num%10) {
        		flag=true;
        		break;
        	}
        	current=num%10;
        	num=num/10;
        }
        if(flag) {
        	System.out.println("Digits are not increasing order");
        }
        else {
        	System.out.println("Digits are in increasing order");
        }
	}

}
