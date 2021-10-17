import java.util.Scanner;
public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num,even=0,odd=0,i,rem;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number: ");
         num=sc.nextInt();
         
        	 while(num!=0) {
        		 rem=num%10;
        		 
        		 if(rem%2==0) {
        			 even=even+rem;
        		 }
        		 else {
        			 odd=odd+rem;
        		 }
        		 num=num/10;
        	 }
        	 
        	 System.out.println("Even sum: "+even);
        	 System.out.println("Odd sum: "+odd);

}
}
