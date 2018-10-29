import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by puranisu on 2/5/2016.
 */
public class HackerEarth_FindPair
{

    /*

PROBLEM STATEMENT

    Given an array A of N numbers, find the number of distinct pairs (i, j) such that j >=i and A[i] = A[j].

First line of the input contains number of test cases T. Each test case has two lines, first line is the number N, followed by a line consisting of N integers which are the elements of array A.

For each test case print the number of distinct pairs.

Constraints
1 <= T <= 10
1 <= N <= 10^6
-10^6 <= A[i] <= 10^6 for 0 <= i < N

Sample Input

3
4
1 2 3 4
3
1 2 1
5
1 1 1 1 1


Output
4
4
15




     */


    public static void main(String[] args) throws IOException
    {
        int T   , N , answer;
        int occur[] , Negativeoccur[] , maxPostitive ,maxNegative , currentNumber;

        Scanner scanner = new Scanner(System.in);

        T = scanner.nextInt();
        while (T>0)
        {
            //N = Integer.parseInt(reader.readLine());
            N = scanner.nextInt();
            //A = new int[N];
            occur = new int[1000001];
            Negativeoccur = new int[1000001];
            Arrays.fill(occur,0);
            Arrays.fill(Negativeoccur,0);
            answer = 0;
            maxPostitive =  Integer.MIN_VALUE ;
            maxNegative =Integer.MAX_VALUE ;

            for (int i = 0; i < N; i++)
            {
                currentNumber = scanner.nextInt();
                if(currentNumber>=0)
                {
                    occur[currentNumber]++;
                    if(currentNumber > maxPostitive)
                    {
                        maxPostitive = currentNumber;
                    }
                }
                else
                {
                    Negativeoccur[-1 * currentNumber]++;
                    if( currentNumber <  maxNegative )
                    {
                        maxNegative =  currentNumber;
                    }
                }
            }

            for (int i = maxNegative; i < 0 ; i++)
            {
                //System.out.println("Occurrence of "+ i + " == "+ Negativeoccur[-1*i]);
                answer += (sumToN(Negativeoccur[-1*i]));
            }
            for (int i = 0; i <= maxPostitive; i++)
            {
                //System.out.println("Occurrence of "+ i + " == "+ occur[i]);
                answer += (sumToN(occur[i]));
            }
            System.out.println(answer);
            T--;
        }
    }
    public static int sumToN(int n)
    {
        if(n!=0)
        {
            return n + sumToN(n-1);
        }
        else
        {
            return  0;
        }
    }
}
