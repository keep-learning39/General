import java.util.Scanner;

/**
 * Created by puranisu on 3/8/2016.
 */
public class Chef_CHEFSPL
{
    public static void main(String[] args)
    {
        int D ;

        String str ;
        Scanner scanner = new Scanner(System.in);

        D = scanner.nextInt();

        while (D>0)
        {
            str = scanner.next();
            solve(str);
            D--;
        }

    }


    public  static  void solve(String str)
    {
        int length = str.length();
        if((length % 2 ) == 1 )
        {
            /*System.out.println(str.substring(0,length/2) );
            System.out.println(str.substring(length/2  , length));

            System.out.println(str.substring(0,length/2 +1) );
            System.out.println(str.substring(length/2 +1 , length));
*/
            if(compare(str.substring(0,length/2) , str.substring(length/2  , length))==1)
            {
                System.out.println("YES");
            }
            else
            if(compare(str.substring(0,length/2+1) , str.substring(length/2+1  , length))==1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        else
        {
            if( str.substring(0,length/2  ).equals(str.substring(length/2 , length)))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }

    }

    private  static  int compare(String s1 , String s2)
    {
        int retVAlue = -1 , i , j  , l1 ,l2 ;

        boolean miss = false;




        l1 = s1.length();
        l2 = s2.length();

        if(Math.abs(l1-l2)>1)
        {
            //System.out.println("NOT SAME");
            return -1;
        }
        i = 0 ;
        j = 0;

        while (i<l1 && j<l2)
        {

            if(s1.charAt(i)==s2.charAt(j))
            {
                i++;
                j++;
                continue;
            }
            else
            {
                if(miss==false)
                {
                    miss = true;
                    i++;
                    continue;
                }
                else
                {
                    retVAlue = -1;
                    break;
                }
            }
        }
        if((j==l2 )&& (i+1==l1) && miss ==false)
        {
            retVAlue = 1;
        }
        if(i==l1 && j==l2)
        {
            retVAlue = 1;
        }
        if(miss==true && j< l2)
        {
            retVAlue = -1;
        }
        return  retVAlue;
    }


}
