import java.util.Scanner;
public class CubeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int noOfTerms;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the no of terms: ");
         noOfTerms=sc.nextInt();
        
         
         System.out.println("The first "+ noOfTerms + " terms of cube series is: ");
         for(int i=1;i<=noOfTerms;i++) {
        	 int term=(i*i*i);
        	   System.out.println(term + " ");
         }
	}

}
