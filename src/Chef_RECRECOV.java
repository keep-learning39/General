import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by puranisu on 2/18/2016.
 */
public class Chef_RECRECOV
{
    /*
    Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains two space-separated integers N and M denoting the number of pieces and number of relations of those N pieces.
Next M lines contain two space-separated integers A and B denoting that piece number A can be followed by piece number B,
all those pairs are guaraneed to be unique within a test case.
Output

For each test case, output a single line containing the minimum number of lines required for all the pieces to be placed acoording to the rules.
Constraints

1 ? T ? 20
1 ? N ? 100
1 ? M ? N2
1 ? Ai ? N
1 ? Bi ? N
There is no sequence S1, S2, ..., Sk such that the piece Si can be immediately followed by the piece Si+1 for all i from 1 to k-1, and that piece Sk can be followed by piece S1.
Example

Input:
3
3 3
1 2
2 3
1 3
3 2
1 2
1 3
5 4
1 3
2 3
3 4
2 5

Output:
1
2
2
     */
    public static void main(String[] args)
    {
        int N , T  , M ,  num1 , num2 ;
        int matrix[][];
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        while(T>0)
        {
            N = scanner.nextInt();
            matrix = new int[N+1][N+1];
            for (int i = 0; i < N; i++)
            {
                Arrays.fill(matrix[i],0);
            }
            M = scanner.nextInt();
            for (int i = 0; i < M; i++)
            {
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                matrix[num1][num2] = 1;
            }
            for (int i = 1; i <= N; i++)
            {
                for (int j = 1; j <= N; j++)
                {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
            for (int i = 1; i <= N; i++)
            {
                for (int j = 1; j <= N; j++)
                {

                }
            }
            T--;
        }




    }

}
