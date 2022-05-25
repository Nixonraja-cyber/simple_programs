import java.util.*;
public class Mark
{
	public static void main(String arg[])
	{
		System.out.println("Enter your Tamil Mark");
		Scanner input=new Scanner(System.in);
			int tamilmark=input.nextInt();
		System.out.println("Enter your English Mark");
			int englishmark=input.nextInt();
		System.out.println("Enter your Maths");
			int mathsmark=input.nextInt();
		System.out.println("Enter your Science");
			int sciencemark=input.nextInt();
		int totalmark=tamilmark+englishmark+mathsmark+sciencemark;
		
		System.out.println("Your Total mark:"+totalmark);
			if(tamilmark>50)
			{
				if(englishmark>50)
				{
					if(mathsmark>50)
					{
						if(sciencemark>50)
						{
							System.out.println("You are Pass");
						}
						else
						{
							System.out.println("you are Fail");
						}
					}
					else
					{
						System.out.println("you are Fail");
					}
				}
				else
				{
					System.out.println("you are Fail");
				}
					
			}
			else
			{
				System.out.println("you are Fail");
			}
			double grade = (totalmark/400.0)*100.0;
			if(grade>90)
			{
				System.out.println("Your grade is O");
			}
			else if(grade>80)
			{
				System.out.println("Your grade is A");
			}
			else if(grade>70)
			{
				System.out.println("Your grade is B");
			}
			else if(grade>=50)
			{
				System.out.println("Your grade is C");
			}
			else
			{
				System.out.println("Your grade is F");
			}

	}
}