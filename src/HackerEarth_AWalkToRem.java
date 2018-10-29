import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by puranisu on 2/22/2016.
 */
public class HackerEarth_AWalkToRem
{
    public static int Matrix[][] , Called[][];
    public static void main(String[] args) {
        int N, M, u, v;


        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        Matrix = new int[N][N];
        Called = new int[N][N];

        M = scanner.nextInt();


        for (int i = 0; i < N; i++) {
            Arrays.fill(Matrix[i], 0);
            Arrays.fill(Called[i], 0);
        }
        for (int i = 0; i < M; i++) {
            u = scanner.nextInt();
            v = scanner.nextInt();
            Matrix[u - 1][v - 1] = 1;
            //Called[u - 1][v - 1] = 1;
        }

        //output(N);
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if(Matrix[i][j]==1 && Called[i][j] == 0)
                {
                    Called[i][j] = 1;
                    OR(i, j, N);
                }
            }
          /*  System.out.println("i  = " + i);
            System.out.println();
            output(N);*/
        }
        for (int i = 0; i < N; i++)
        {
            if(Matrix[i][i] == 1)
            {
                System.out.print("1 ");
            }
            else
            {
                System.out.print("0 ");
            }
        }




    }
    /*public  static  void output(int N)
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(Matrix[i][j]);
            }
            System.out.println();
        }

    }
*/
    public static void OR(int i, int j , int N)
    {
        //System.out.println("Repeat at i = "+ i + " & j = "+j);
        for (int k = 0; k < N; k++)
        {
            if(Matrix[j][k] == 1)
            {
                if(Matrix[i][k] == 0 && Called[i][k] == 0)
                {
                    Matrix[i][k] = 1;
                    Called[i][k] = 1;
                    OR(i , k ,N);
                }
                Matrix[i][k] = 1;
            }
        }
    }


}
