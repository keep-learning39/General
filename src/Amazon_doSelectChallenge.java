import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by puranisu on 9/7/2016.
 */
public class Amazon_doSelectChallenge
{
    public static void main(String[] args)
    {
        int array [] , subarray[] ;

        int n ,  q , l , r ;
        long result = 0;


        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        q = scanner.nextInt();


        array = new int[n];




        for (int i = 0; i < n; i++)
        {
            array[i] = scanner.nextInt();

        }


        for (int i = 0; i < q; i++)
        {
            result = 0;

            l = scanner.nextInt();
            r = scanner.nextInt();



            subarray = Arrays.copyOfRange(array, l - 1, r);
            Arrays.sort(subarray);



            int prev = 0   ,diff = 1;

            for (int j = 1; j <= subarray.length; j++)
            {
                if(j==subarray.length)
                {
                    diff = j - prev ;
                    result += (diff * diff * subarray[prev]);
                }
                else
                if(subarray[j]!= subarray[prev])
                {
                    diff = j - prev;
                    result += (diff * diff * subarray[prev]);
                    prev = j;
                }
            }

            System.out.println(result);
        }



    }


//    public static void main(String[] args)
//    {
//        int array [] ;
//        int n ,  q , l , r ;
//
//
//        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//        q = scanner.nextInt();
//
//
//        array = new int[n];
//
//        for (int i = 0; i < n; i++)
//        {
//            array[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < q; i++)
//        {
//            l = scanner.nextInt();
//            r = scanner.nextInt();
//        }
//
//    }
}


/*




Given an array of n positive integers a1, a2, ..., an, consider its arbitrary subarray al, al+1, al+2 ....., ar where 1 ? l ? r ? n. Your task is to determine the beauty of a subarray where beauty is defined as the sum of products (Ks2) * s, where Ks denotes the occurrence of an integer 's' in given subarray. Given q different queries, you have to find the beauty of given subarrays.



Input format

The First line contains two integers n and q (1 ? n, q ? 100000) � the array length and the number of queries respectively.

The Second line contains n positive integers ai (1 ? ai ? 1000000) � the elements of the array.

Next q lines contain two positive integers l, r (1 ? l ? r ? n) each � the indices of the left and the right ends of the corresponding subarray.



Output format

Output q lines, the ith line of the output should contain single positive integer � the beauty of the ith query subarray.



Sample test cases



Input

3 2
1 2 1
1 2
1 3


Output

3
6


Explanation

For 1st query, the subarray is {1,2}. K1 = 1 and K2 = 1.

Beauty of subarray is 1.1.1 + 1.1.2 = 3

For 2nd query, the subarray is {1,2,1}. K1 = 2 and K2 = 1.

Beauty of subarry is 2.2.1 + 1.1.2 = 6
 */