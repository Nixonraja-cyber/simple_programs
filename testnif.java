import java.util.*;
public class testnif
{
public static void main(String arg[])
{
System.out.println("Enter your mark");
Scanner input=new Scanner(System.in);
int mark=input.nextInt();

switch(mark)
	{
		case 82:
		{
			mark=82;
			System.out.println("You are lucky"+mark);
			break;
		}		
		case 72:
		{
			mark=72;
			System.out.println("you are lucky"+mark);
			break;
		}
		case 92:
		{
			mark=92;
			System.out.println("you are lucky"+mark);
			break;
		}
		default:
		{
		}
	}
if(mark>=100)
	{
		mark=100;
		System.out.println("Excellent"+mark);
	}
	if(mark>90)
	{
		System.out.print("Try to reach sky"+mark);
	}
	if(mark>=80)
	{
		mark=100;
		System.out.println("Excellent"+mark);
	}
	if(mark>=70)
	{
		mark=mark+10;
		System.out.println("you are passed"+mark);
	}
	if(mark>=50)
	{
		mark=mark+5;
		System.out.println("you are passed"+mark);
	}
	
else
	{
		mark=mark;
		System.out.println("you are failed"+mark);
	}
}
}