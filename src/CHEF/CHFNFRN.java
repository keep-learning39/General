package CHEF;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by puranisu on 9/2/2016.
 */
class CHFNFRN
{
    public static void main(String[] args) throws  Exception
    {
        int T ;
        Scanner scanner = new Scanner(System.in);


        int N , M , a , b;

        int matrix [];


        T = scanner.nextInt();

        while (T > 0)
        {
            N = scanner.nextInt();
            matrix = new int[(N+1) * (N+1)];
            Arrays.fill(matrix,0);

            M = scanner.nextInt();

            for (int i = 0; i < M; i++)
            {
                a = scanner.nextInt();
                b = scanner.nextInt();
                matrix[a*N+b] = 1;
                matrix[b*N+a] = 1;
            }
            boolean flag = true;

            for (int i = 1; i <= N; i++)
            {
                if(flag == true)
                for (int j = i+1; j <= N; j++)
                {
                    if((flag == true) && matrix[i*N + j]==0)
                    {
                        for (int k = 1; k<=N ; k++)
                        {
                            if(i!=k && j!=k && matrix[i*N + k]==0 && matrix[j*N + k] == 0)
                            {
                                System.out.println("NO");
                                flag = false;
                                break;
                            }
                        }
                    }
                }
            }
            if(flag)
            System.out.println("YES");

            T--;
        }


    }

}
