import java.util.*;
public class practice
{
public static void main(String arg[])
{
System.out.println("Enter your mark");
Scanner input=new Scanner(System.in);
int mark=input.nextInt();	
if(mark>=80)
	{
	mark=mark+20;
	System.out.print("Excellent "+100);
	}
else if(mark>=70)
	{
		mark=mark+10;
		if(mark!=82)
			{
			System.out.print("you are passed "+mark);
			}
	}
else if(mark>50)
	{
	mark=mark+5;
	if(mark!=72)
		{
		System.out.print("you are passed "+mark);
		}
	}

else
	{
	System.out.print("you are failed "+mark);
	}
switch(mark)
	{
		case 92:
		{
		System.out.print("you are lucky"+mark);
		break;
		}
		case 82:
		{
		System.out.print("you are lucky"+mark);
		break;
		}
		case 72:
		{
		System.out.print("you are lucky"+mark);
		break;
		}
	}

}
}