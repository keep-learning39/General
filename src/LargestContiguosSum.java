import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by puranisu on 2/2/2016.
 */
public class LargestContiguosSum
{
    public static void main(String[] args) {
        int t;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            t = Integer.parseInt(reader.readLine());

            int firstOccurence = -1, lastOccur = -1;
            int Arr[];
            char ch ;
            String str;
            while (t > 0)
            {
                firstOccurence = -1;
                lastOccur = -1;
                Arr = new int[100000000];
                int i = 0 , l ;
                str = reader.readLine();
                l = str.length();
                while ( i!=l)
                {
                    ch = str.charAt(i);
                    Arr[i] = ch == 'R' ? -1 : 1;
                    if (ch == 'K') {
                        if (firstOccurence == -1)
                            firstOccurence = i;
                        lastOccur = i;
                    }
                    i++;
                }
            if(firstOccurence==-1)
            {
                System.out.println(i-1);
            }
            else
                maxSum(Arr, i, firstOccurence, lastOccur);
                //System.out.println("4");
                t--;
            }
        } catch (Exception e)
        {
            return;
        }
        return;
    }
    public static int maxSum(int Array[], int length , int a , int b)
    {
        int max_so_far = 0, max_ending_here = 0 , lastIndex = -1;
        for (int i = a; i <=b; i++)
        {
            max_ending_here = max_ending_here + Array[i];
            if ( max_ending_here < 0 )
            {
                max_ending_here = 0;
            }
            if(max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
                lastIndex = i;
            }
        }
        int tempSum = max_so_far , i;
        for ( i = lastIndex ; tempSum >0 ; i--)
        {
            tempSum-=Array[i];
        }
        /*System.out.println("BOUNDS " + (i+1)+ "  "+lastIndex);
        System.out.println("a , b " +a + b);
*/
        if(i==-1)
        {
            i=0;
        }

        int  Forward[] , sumForward = 0;
        Forward = new int[100000000];
        for (int j = 0; j < length ; j++)
        {
            if(Array[j]==-1)
            {
                sumForward ++;
                Forward[j] = sumForward;
            }
            else
            {
                if(j!=0)
                    Forward[j] = Forward[j-1];
            }
        }
        int sum =(lastIndex - i + 1 ) -(Forward[lastIndex]-Forward[i] + 1)+ Forward[i+1] +(Forward[length-1]-Forward[lastIndex]);
        System.out.println(sum);

        return max_so_far;
    }
}

