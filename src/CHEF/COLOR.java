package CHEF;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by puranisu on 4/4/2016.
 */
public class COLOR
{
    public static void main(String[] args)
    {
        // https://www.codechef.com/APRIL16/problems/COLOR
        int T , n ;
        int count[] = new int[3];

        String string;

        char c ;

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();



        while (T>0)
        {
            Arrays.fill(count , 0);
            n = scanner.nextInt();
            string = scanner.next();
            for (int i = 0; i < string.length(); i++)
            {
                if(string.charAt(i)=='R')
                {
                    count[0]++;
                }
                else
                if(string.charAt(i)=='G')
                {
                    count[1]++;
                }
                else
                {
                    count[2]++;
                }
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i <= 2; i++)
            {
                if(count[i]>max)
                {
                    max = count[i];
                }
            }
            System.out.println((string.length()-max));
            T--;
        }
    }
}
