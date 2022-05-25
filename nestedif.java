import java.util.*;
class nestedif
{
public static void main(String arg[])
{
 System.out.println("Enter your mark");
Scanner input=new Scanner(System.in);
byte mark=input.nextbyte();
if(mark>=100)
{
System.out.println(100);
	if(mark>80)
	{
	byte totalmark=mark+20;
	System.out.println(totalmark);
	}
	if(mark>70)
	{
	byte totalmark=mark+10;
	System.out.println(totalmark);
	}
	if(mark>50)
	{
	byte totalmark=mark+5;
	System.out.println(totalmark);
	}
}
else
{
System.out.println("your failed");
System.out.println(mark);
}
}
}