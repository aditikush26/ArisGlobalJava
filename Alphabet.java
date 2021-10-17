import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character: ");
		String ch=sc.next();
		
		if(ch=="a"|| ch=="e"|| ch=="i"||ch=="o"|| ch=="u"||ch=="A"||ch=="E"||ch=="O"||ch=="I"||ch=="U") {
			System.out.println("Vowel");
		}
		else {
		    System.out.println("Consotants");
		}
	}

}
