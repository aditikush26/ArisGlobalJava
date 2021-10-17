import java.util.Scanner;
public class NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i,n, sum=0;
          {
        	  Scanner sc=new Scanner(System.in);
        	  System.out.println("Input number of terms: ");
        	  n=sc.nextInt();
          }
          System.out.println("First  N natural numbers: ");
          
          for(i=1;i<=n;i++) {
        	  System.out.println(i);
        	  sum=sum+i;
          }
          System.out.println("Sum "+sum);
	}

}
