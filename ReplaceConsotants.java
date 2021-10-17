import java.util.*;
public class ReplaceConsotants {
	
	public String alterString(String str)
	{
		StringBuffer sbr=new StringBuffer(str);
		for(int i=0;i<str.length();i++)
		{
			char c=sbr.charAt(i);
			if(!(c=='A' || c=='a' || c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U'|| c=='u'))
			{
				sbr.replace(i,i+1,String.valueOf((char)(c+1)));
			}
		}
		return sbr.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceConsotants r=new ReplaceConsotants();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.next();
		System.out.println(r.alterString(str));

	}

}
