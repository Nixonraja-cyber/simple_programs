import java.util.*;
public class Function
{
	static String numberprint(int value)
	{

			if(value<50)
			{
				String result = "fail";
				return result;
			}
		else
			{
				String result = "pass";
				return result;
			}
	}
	public static void main(String arg[])
	{
		System.out.println("Enter ur mark");
		Scanner input=new Scanner(System.in);
		int value=input.nextInt();
	      String result = numberprint(value);
		System.out.println(result);
	}
}
