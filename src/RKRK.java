import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by puranisu on 2/1/2016.
 * https://www.hackerearth.com/tracks/pledge-2015-easy/number-of-rs-1/
 */
public class RKRK
{
    /*public static void main(String[] args) throws IOException {
        int t = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(reader.readLine());
        int Arr[] , I, J =0  ;
        char ch  ;
        while (t > 0)
        {
            I = -1;
            Arr = new int[100000000];
            int i = 0;
            while(( ch= (char) reader.read())!='\n' )
            {
                Arr[i] = ch=='R'?0:1;
                if(Arr[i]==1)
                {
                    if( I == -1)
                    {
                        I = i ;
                    }
                    J = i;
                }
                i++;
            }

            //System.out.println(I + "  " + J);
            *//*for (int k = 0; k < i; k++)
            {
                System.out.print(Arr[k]);
            }*//*
            System.out.println(I+recurse(Arr, I, J)+(i-J-1));

            t--;
        }
    }
    static int recurse(int A[],  int i , int j)
    {
        if (i == j)
        {
             return A[i];
        }
        int retBeg= A[i]+ recurse(A,i+1,j);
        int retEnd=recurse(A,i,j-1) + A[j];
        return retBeg>retEnd ? retBeg : retEnd ;
    }*/

    public static void main(String[] args) throws  IOException
    {

        int t ;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(reader.readLine());

        int Arr[] , Forward[] , Reverse[]  , sumForward = 0, sumReverse = 0 ;
        int firstOccurence =-1, lastOccur =-1;

        char ch  ;
        while (t > 0)
        {
            Arr = new int[100000000];
            Forward = new int[100000000];
            Reverse = new int[100000000];
            int i = 0;
            sumForward = 0;
            sumReverse = 0;
            while(( ch= (char) reader.read())!='\n' )
            {
                Arr[i] = ch=='R'?1:0;
                if(ch=='K')
                {
                    if(firstOccurence==-1)
                    firstOccurence = i;
                    lastOccur = i;
                }
                i++;
            }
            System.out.println("Length of array "+i);
            for (int j = 0; j < i ; j++)
            {
                if(Arr[j]==1)
                {
                    sumForward ++;
                    Forward[j] = sumForward;
                }
                else
                {
                    if(j!=0)
                    Forward[j] = Forward[j-1];
                }
                if(Arr[i-j-1]==1)
                {
                    sumReverse ++;
                    Reverse[i-j-1]= sumReverse;
                }
                else
                {
                        Reverse[i-j-1]= Reverse[i-j];
                }
            }

            for (int j = 0; j < i; j++)
            {
                System.out.print(Forward[j]);
            }
            System.out.println("");

            for (int j = 0; j < i; j++)
            {
                System.out.print(Reverse[j]);
            }
            t--;
        }
    }
}
