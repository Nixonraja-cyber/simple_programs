import java.util.*;
public class romon
{
	public static int converter(String a)
	{
		String[] arr=new String[a.length()];
		arr=a.split("");
		int ans=0;
		for(int i=0;i<a.length();i=i+1)
		{
			if(arr[i].equals("M"))
			{
				ans=ans+1000;
			}
			else if(arr[i].equals("D"))
			{
				ans=ans+500;
			}
			else if(arr[i].equals("C"))
			{
				ans=ans+100;
			}
			else if(arr[i].equals("L"))
			{
				ans=ans+50;
			}
			else if(arr[i].equals("X"))
			{
				ans=ans+10;
			}
			else if(arr[i].equals("V"))
			{
				ans=ans+5;
			}
			else
			{
				ans=ans+1;
			}
		}
		
		return ans;
	}
}