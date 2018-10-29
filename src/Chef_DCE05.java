import java.util.Scanner;

/**
 * Created by puranisu on 2/26/2016.
 */
public class Chef_DCE05
{

    public static void main(String[] args)
    {
        int T , n  , count = 0;
        Scanner scanner = new Scanner(System.in);

        T = scanner.nextInt() ;

        while ( T > 0 )
        {
            count = 0 ;
            n = scanner.nextInt();
            while (n>0)
            {
                n/=2 ;
                count++;
            }

            System.out.println((int)Math.pow((double)(2) , (double)(--count)));
            T --;
        }
    }
}

/*

All submissions for this problem are available.

The captain of the ship TITANIC is a little .... off the track. He needs to select the crew for the ship. But everyone seems to be eligible. So to test their intelligence, he plays a game.
The contestants have to stand in a line. They are given the numbers in the order in which they stand, starting from 1. The captain then removes all the contestants that are standing at an odd position.
Initially, standing people have numbers - 1,2,3,4,5...
After first pass, people left are - 2,4,...
After second pass - 4,....
And so on.
You want to board the ship as a crew member. Given the total number of applicants for a position, find the best place to stand in the line so that you are selected.
Input

First line contains the number of test cases t (t<=10^5). The next t lines contain integer n, the number of applicants for that case. (n<=10^9)
Output

Display t lines, each containg a single integer, the place where you would stand to win a place at TITANIC.
Example

Input:
2
5
12


Output:
4
8


 */