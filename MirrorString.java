import java.util.*;
public class MirrorString {
	
	public String getImage(String str)
	{
		StringBuffer sbr=new StringBuffer(str);
		sbr.append('|');
		StringBuffer sbr1=new StringBuffer(str);
		sbr1.reverse();
		sbr.append(sbr1);
		return sbr.toString();			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MirrorString mstr=new MirrorString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		System.out.println(mstr.getImage(str));
	}

}
