package HackerEarth;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by puranisu on 5/17/2016.
 */
public class IRCTC
{
    //https://www.hackerearth.com/problem/algorithm/irctc/

    public static void main(String[] args)
    {
        int t , n , k;

        Scanner scanner = new Scanner(System.in);

        t = scanner.nextInt();

        int distance_matrix[][];

        while ( t > 0 )
        {
            n = scanner.nextInt();
            k = scanner.nextInt();

            distance_matrix = new int[n][n];

            for (int i = 0; i < n; i++)
            {
                Arrays.fill(distance_matrix[i],0);
            }

            for (int i = 0; i < k; i++)
            {

            }

            t--;
        }

    }


}

