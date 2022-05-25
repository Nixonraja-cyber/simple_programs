import java.util.*;
public class array
{
	public static void main(String arg[])
	{
		int [] mark=new int[4];
		for(int i=0;i<3;i=i+1)
		{
			System.out.println("Enter your mark "+i);
			Scanner input=new Scanner(System.in);
			mark[i]=input.nextInt();
		}
		for(int i=0;i<3;i=i+1)
		{
			System.out.println("Enter your mark "+i+" "+mark[i]);
			
		}
	}
}