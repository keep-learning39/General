import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by puranisu on 3/4/2016.
 */
public class Chef_STRPALIN
{
    //https://www.codechef.com/MARCH16/problems/STRPALIN

    public static void main(String[] args)
    {
        int stringMap[] = new int[26] , T;
        String str ;
        boolean result = false;


        Arrays.fill(stringMap , 0 );

        Scanner scanner = new Scanner(System.in);

        T = scanner.nextInt();
        while (T>0)
        {
            result = false;
            Arrays.fill(stringMap , 0 );
            str = scanner.next();
            for (int i = 0; i < str.length(); i++)
            {
                stringMap[(int)(str.charAt(i) - 'a')]=1;
            }

            str = scanner.next();
            for (int i = 0; i < str.length(); i++)
            {
                if(stringMap[(int)(str.charAt(i) - 'a')]== 1)
                {
                    System.out.println("Yes");
                    result = true;
                    break;
                }
            }
            if(result==false)
            {
                System.out.println("No");
            }

            T--;
        }



    }
}

/*


while (T>0)
        {
            result = false;
            Arrays.fill(stringMap , 0 );
            //str = scanner.next();
            for (int i = 0; i < str.length(); i++)
            {
                stringMap[(int)(str.charAt(i) - 'a')]=1;
            }

            str = scanner.next();
            System.out.println(str + str.length());
            for (int i = 0; i < str.length(); i++)
            {
                if(stringMap[(int)(str.charAt(i) - 'a')]== 1)
                {
                    System.out.println("YES");
                    result = true;
                    break;
                }
            }
            if(result==false)
            {
                System.out.println("NO");
            }

            T--;
        }

 */