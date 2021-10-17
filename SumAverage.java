import java.util.Scanner;
public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,n=0,sum=0;
       double avg;
       {
    	   System.out.println("Input 5 numbers: ");
       }
       
       for(i=0;i<5;i++) {
    	   Scanner sc=new Scanner(System.in);
    	   n=sc.nextInt();
    	   
    	sum=sum+n;   
       }
       avg=sum/5;
       System.out.println("The sum of 5 numbers: "+ sum);
       
       System.out.println("The average of 5 numbers is "+ avg);
	}

}
