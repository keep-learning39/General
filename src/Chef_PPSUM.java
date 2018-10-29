import java.util.Scanner;

/**
 * Created by puranisu on 2/23/2016.
 */
public class Chef_PPSUM
{
    public static void main(String[] args)
    {
        int T , D , N , sum = 0 ;
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        while ( T > 0 )
        {
            D = scanner.nextInt();
            N = scanner.nextInt();



            while( D > 0 )
            {
                sum = N * ( N + 1 ) / 2 ;
                N = sum;
                D -- ;
            }
            System.out.println(sum);
            T--;
        }


    }
}
