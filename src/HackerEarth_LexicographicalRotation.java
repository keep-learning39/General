import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by puranisu on 3/9/2016.
 * https://www.hackerearth.com/problem/algorithm/largest-lexicographical-rotation-ii/description/
 *
 */
public class HackerEarth_LexicographicalRotation
{
    public static void main(String[] args)
    {
        String str  , result , temp ;
        char ch = 'a'-1;
        Scanner scanner = new Scanner(System.in);


        str = scanner.next();

        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i)>ch)
            {
                ch = str.charAt(i);
            }
        }
        result = str;


        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i)==ch)
            {
                temp = str.substring(i,str.length())+str.substring(0,i);
                if(compare(temp,result)==1)
                {
                    result = temp;
                }
            }
        }
        System.out.println(result);


    }
    public  static  int compare (String s1 , String s2)
    {
        int l = s1.length();
        for (int i = 0; i < l; i++)
        {
            if(s1.charAt(i)>s2.charAt(i))
            {
                return  1;
            }
            else
            if(s2.charAt(i)>s1.charAt(i))
            {
                return -1;
            }
        }
        return  0;
    }
}
