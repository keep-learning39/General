package CHEF;

import java.util.Scanner;

/**
 * Created by puranisu on 4/28/2016.
 */
public class MOVIEWKN
{

    public static void main(String[] args)
    {
        int T , n ;
        int L[] , R[];

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();


        while (T > 0 )
        {
            n = scanner.nextInt();
            L = new int[n];
            R = new int[n];
            for (int i = 0; i < n; i++)
            {
                L[i] = scanner.nextInt();
            }
            int val = Integer.MIN_VALUE, minIndex = Integer.MAX_VALUE , maxR = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++)
            {
                R[i] = scanner.nextInt();
                if(L[i] * R[i]  > val)
                {
                    val = L[i] * R[i];
                }
            }


        }




    }
}
