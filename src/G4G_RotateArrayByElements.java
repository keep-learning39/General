import java.util.Scanner;

/**
 * Created by puranisu on 3/9/2016.
 */
public class G4G_RotateArrayByElements
{
    //Rotate Array by n elements
    //http://www.practice.geeksforgeeks.org/problem-page.php?pid=360

    public static void main(String[] args)
    {
        int T  , n  ,d ;
        int array[];

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        while ( T > 0 )
        {
            n = scanner.nextInt();
            d = scanner.nextInt();
            array = new int[n];
            for (int i = 0; i < n; i++)
            {
                array[i] = scanner.nextInt();
            }

            for (int i = d; i < n; i++)
            {
                System.out.print(array[i]+" ");
            }
            for (int i = 0; i < d; i++)
            {
                System.out.print(array[i]+" ");
            }
            System.out.println();
            T--;
        }
    }

}
