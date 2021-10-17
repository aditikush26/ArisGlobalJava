import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		double r1,r2;
		Scanner sc=new Scanner(System.in);
		System.out.println("value of a : ");
		a=sc.nextDouble();
		
		System.out.println("value of b: ");
		b=sc.nextDouble();
		
		System.out.println("value of c: ");
		c=sc.nextDouble();
		
		double determinant=b*b-4*a*c;
		
		if(determinant>0) {
			r1=(-b + Math.sqrt(determinant))/(2*a);
			r2=(b + Math.sqrt(determinant))/(2*a);
			System.out.println("Roots are: "+ r1 + " and "+ r2);
		}
		
		else if(determinant==0) {
			System.out.println("Root is "+(-b/(2*a)));
		}
		
		else {
			System.out.println("Equation has no real roots");
	}

}
}
