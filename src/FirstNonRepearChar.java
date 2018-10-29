import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by puranisu on 2/5/2016.
 */
public class FirstNonRepearChar
{

    /*
    "Find a 1st non-repeated char in the string for e.g. if string is "Salesforce is the best company to work for” returns 'l'"
     */
    public static void main(String[] args) throws IOException
    {

        int input , next = 0 ;
        int occur[] = new int[27] , stack[] = new int[30] , answer = 0 ;


        Arrays.fill(occur, -1);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        while ((input = reader.read())!='\n')
        {
            if(input>='A' && input<='Z')
            {

                input-='A';
            }
            else
            if(input>='a' && input<='z')
            {

                input-='a';
            }
            else
            {
                input = 26;
            }
            occur[input] ++;

            if(occur[input]==0)
            {
                stack[next]=input;
                next++;
            }
        }
        next-- ;
        int j = 0;
        while (j<next)
        {
            if(occur[stack[j]]==0)
            {
                answer = stack[j]+'A';
                break;
            }
            j++;
        }
        System.out.println("\n\n\n"+ (char)answer);

    }
}
