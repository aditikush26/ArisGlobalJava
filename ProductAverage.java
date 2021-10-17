import java.util.Scanner;
public class ProductAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="";
         int sum=0,product=1,avg=0;
         int count=0;
         Scanner sc=new Scanner(System.in);
         
         while(!str.equals("q")) {
        	 System.out.println("Enter numbers or q to quit: ");
        	 str=sc.next();
        	 
        	 if(!str.equals("q")) {
        		 int number=Integer.parseInt(str);
        		 sum=sum+number;
        		 product=product*number;
        		 count++;
        		 avg=sum/count;
        	 }
         }
         System.out.println("Product "+product);
         System.out.println("Average "+avg);
	}

}
