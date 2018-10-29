package GeeksForGeeks;

import java.util.Scanner;

/**
 * Created by puranisu on 3/14/2016.
 */
public class maximum_of_all_subArrays_ofsizeK
{
    public static void main(String[] args)
    {
        /*

        http://www.geeksforgeeks.org/maximum-of-all-subarrays-of-size-k/

         */
        int T , array[] , queue[];

        int n, k  ;

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        while ( T > 0 )
        {
            n = scanner.nextInt();
            k = scanner.nextInt();
            array = new int[n];
            queue = new int[k];
            for (int i = 0; i < n; i++)
            {
                array[i] = scanner.nextInt();
                if(i<k)
                {
                    queue[i]=array[i];
                }
            }

            for (int i = k-1; i < n; i++)
            {
            }
            T--;
        }

    }

}
/*

2
9 3
1 2 3 1 4 5 2 3 6
//0 1 2 3 4 5 6 7 8
10 4
8 5 10 7 9 4 15 12 90 13


n-k+1

 3 3  4  5 5 5 6
10 10 10 15 15 90 90



 */