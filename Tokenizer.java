import java.util.*;
public class Tokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digit;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter sequence of integers with space between them: ");
         digit=sc.nextLine();
         StringTokenizer token=new StringTokenizer(digit);
         int d=0,sum=0;
         System.out.println("Entered digits are: ");
         while(token.hasMoreTokens()) 
         {
        	 String s=token.nextToken();
        	 d=Integer.parseInt(s);
        	 System.out.print(d + " ");
        	 sum=sum+d;
         }
         System.out.println();
         System.out.println("sum is "+ sum);
	}

}
