import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by puranisu on 2/2/2016.
 */
public class RKRKRKRK
{
    public static void main(String[] args) throws IOException
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
                Arr[i] = ch=='R'?-1:1;
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
