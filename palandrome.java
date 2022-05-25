import java.util.*;
public class palandrome
{
	public static void main(String [] arg)
	{
		System.out.println("Enter a string");
		Scanner input=new Scanner(System.in);
		String a=input.next();
		String[] b=a.split("");
		String c="";
		for(int i=b.length-1;i>=0;i=i-1)
		{
			c=c+b[i];
			
		}
		if(a.equals(c))
			{
				System.out.println("It is a palandrome");
			}
			else
			{
				System.out.println("it is not a palandrome");
			}
	}
}