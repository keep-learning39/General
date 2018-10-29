import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by puranisu on 3/3/2016.
 */
public class HackerRank_SimilarPair
{
    //https://www.hackerrank.com/challenges/similarpair

    static  int N , T;
    static int matrix[][]  , root[] , leaf[];

    public static void main(String[] args)
    {
        int  iterator  = 0 , s , e  , rootNode = 0;

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        T = scanner.nextInt();

        matrix = new int[N][N];
        root = new int[N];
        leaf = new int[N];

        Arrays.fill(root, 0 );
        Arrays.fill(leaf, 1 );

        for (int i = 0; i < N; i++)
        {
            Arrays.fill(matrix[i] , 0);
        }

        while ( iterator < N-1 )
        {
            s = scanner.nextInt();
            e = scanner.nextInt();

            matrix[e-1][s-1] = 1;
            root[e-1] = -1;
            leaf[s-1] = 0 ;
            iterator ++;
        }

        for (int i = 0; i < N; i++)
        {
            if(root[i] == 0 )
            {
                rootNode = i;
            }
        }

        int stack[] ;
        stack = new int[N];
        stack[0] = rootNode;

        System.out.println(traverse(rootNode, stack, 1));

    }
    public static  int traverse(int Node , int stack[] , int stackLength)
    {
        int result ;

        result =  0 ;

        for ( int i = 0; i < stackLength-1; i++ )
            {
                if(Math.abs(stack[i] - Node) <= T)
                {
                    result++ ;
                }
            }

        for (int i = 0; i < N; i++)
        {
            if(matrix[i][Node]==1)
            {
                stack[stackLength] = i ;
                result += traverse(i , stack , stackLength + 1 ) ;
            }
        }
        return  result ;
    }

}


