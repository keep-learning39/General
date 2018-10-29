package CHEF;

import java.util.Scanner;

/**
 * Created by puranisu on 9/6/2016.
 */
public class LONGSEQ
{
    public static void main(String[] args) throws Exception
    {
        int T , ones;
        String D;
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        for (int i = 0; i < T; i++)
        {
            ones = 0;
            D = scanner.next();
            for (int j = 0; j < D.length(); j++) {
                if(D.charAt(j)=='1')
                {
                    ones ++;
                }
            }
            if((D.length()==(ones+1))||(ones == 1))
            {
                System.out.println("Yes");
                continue;
            }
            System.out.println("No");
        }

    }
}
