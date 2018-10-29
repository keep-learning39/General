package CHEF;

import java.util.Scanner;

/**
 * Created by puranisu on 4/5/2016.
 */
public class CHEFPATH
{
    public static void main(String[] args)
    {
        long T , n , m ;
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextLong();

        while (T>0)
        {
            n = scanner.nextLong();
            m = scanner.nextLong();

            if(n%2 == 0 || m%2 ==0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
            T--;
        }



    }
}
