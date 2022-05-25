import java.util.*;
public class fnlt
{
    public static void repeat(int s,int e)
	{
		int i,j;
		for(i=s;i<=e;i=i+1)
		{
			for(j=s;j<=i;j=j+1)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		for(int i=0;i<inp;i++){
		    System.out.println();
		    repeat(1,5);
		}
	}
}