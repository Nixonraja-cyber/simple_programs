import java.util.*;
public class Try
    {
        public static void main(String[]args)
        {
            int rows = 5, i = 1;

            while(i <= rows)
            {
                int j = 1;
                while(j <= i)
                {
                    System.out.print("*");
                    j++;
                }
                System.out.print("\n");
                i++;

            }
        }
}