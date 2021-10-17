import java.util.Scanner;
public class FindDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num,digit,i;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number: ");
          num=sc.nextInt();
          
          System.out.println("Enter digit: ");
          digit=sc.nextInt();
          
         for(i=0;i<=num;i++) {
        	 if(i==digit) {
        		 System.out.println(i + " ");
        	 }
         }
	}

}
