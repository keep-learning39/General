import java.util.Scanner;

/**
 * Created by puranisu on 2/29/2016.
 */
public class HackerEarth_RiseOFWeirdThings
{
    public static void main(String[] args)
    {
        int N  , temp ;
        int Array[] ;
        Scanner scanner = new Scanner(System.in);


        N = scanner.nextInt();
        Array = new int[N];
        for (int i = 0; i < N; i++)
        {
            Array[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N - i - 1; j++)
            {
                if(Array[j]>Array[j+1])
                {
                    temp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }
            }
        }

        int sum = 0 , firstOdd = -1;
        for (int i = 0; i < N; i++)
        {
            if(Array[i]%2==0)
            {
                System.out.print(Array[i]+" ");
                sum += Array[i];
            }
            else
            {
                if(firstOdd == -1)
                {
                    firstOdd = i;
                }
            }
        }
        System.out.print(sum+" ");
        sum = 0;
        for (int i = 0; i < N; i++)
        {
            if(Array[i]%2 == 1)
            {
                System.out.print(Array[i]+ " ");
                sum += Array[i];
            }
        }
        System.out.print(sum + " ");
    }
}

