package CHEF;

import java.util.Scanner;

/**
 * Created by puranisu on 4/5/2016.
 */
public class CHBLLNS
{
    public static void main(String[] args)
    {
        // https://www.codechef.com/APRIL16/problems/CHBLLNS

        int T , min =Integer.MAX_VALUE , max = Integer.MIN_VALUE , k ;

        int minIndex =-1 , maxIndex= -1  , midIndex = 0 , sum = 0 ;
        int count[] = new int[3];


        Scanner scanner  = new Scanner(System.in);
        T = scanner.nextInt();

        while ( T > 0 )
        {
            sum = 0;
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++)
            {
                count[i]=scanner.nextInt();
                sum += count[i];
                if( count[i] < min)
                {
                    min = count[i];
                    minIndex = i;
                }
                if( count[i] >= max)
                {
                    max = count[i];
                    maxIndex = i;
                }
            }
            //System.out.println(minIndex+"\n"+maxIndex);
            for (int i = 0; i < 3; i++)
            {
                if(minIndex != i && maxIndex!=i)
                {
                    midIndex = i;
//                    System.out.println(midIndex);
                }
            }
            /*System.out.println("min = " + count[minIndex]);
            System.out.println("mid = " + count[midIndex]);
            System.out.println("max = " + count[maxIndex]);
            */k = scanner.nextInt();
            if(k==1)
            {
                System.out.println(k);
            }
            else
            if(k <= count[minIndex])
            {
                System.out.println((((k-1)*3)+1));
            }
            else
            if(k <= count[midIndex])
            {
                System.out.println((count[minIndex] * 3 + (k - count[minIndex] -1 ) * 2  + 1 ));
            }
            else
            if(k<=count[maxIndex])
            {
                int val = (count[minIndex] * 3 + (count[midIndex] - count[minIndex] ) * 2  + (k - count[midIndex] - count[minIndex] )+ 1 );
                if(val <= sum)
                {
                    System.out.println(val);
                }
            }
            T--;
        }



    }
}
