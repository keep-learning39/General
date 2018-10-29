package CareerCup;

import java.util.Scanner;

/**
 * Created by puranisu on 4/1/2016.
 */
public class SortedArrayRotation
{

    /*

    https://www.careercup.com/question?id=18325674

    Given a sorted array which is rotated n number of times.
    Find out how many times the array is rotated.
    Time complexity should be less than O(n).


    7 8 9 1 2 3 4 5 6

    size = 9
    i = 4, n = 2
    i = 2, n = 9
    i = 3, n = 1

     */
    public static void main(String[] args)
    {
        int Array[] , n ;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        Array = new int[n];

        for (int i = 0; i < n; i++)
        {
            Array[i] = scanner.nextInt();
        }
        System.out.println(numberOfRotation(Array, 0 , n-1));



    }

    private static int numberOfRotation(int[] array, int a , int z )
    {
        int mid = ( a + z )/2;
        while (a!=z && a !=mid && z!=mid)
        {
            //System.out.println("a = "+a +"  z  = "+ z +"  mid = "+ mid );
            if(array[mid]<array[a])
            {
                z = mid;
            }
            else if (array[mid]>array[z])
            {
                a = mid;
            }
            mid = ( a + z )/2;
        }
        return  mid+1;
    }
}

/*

7 8 9 1 2 3 4 5 6

a = 0 , z = 8
mid = 4 n = 2

a = 0 z = 4
mid = 2 n = 9

a = 2 z = 4
mid = 3 n = 1

a = 2 z = 3
mid = 2 n = 9


 */
