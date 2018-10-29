package CHEF;

import java.util.Scanner;

class LEXOPAL
{
    public static void main(String[] args) throws Exception
    {
        int T, l  ;
        String s;
        StringBuilder str = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        boolean flag;

        for (int i = 0; i < T; i++)
        {
            flag = true;
            str = new StringBuilder();
            s = scanner.next();
            l = s.length();
            int j ;
            for (j = 0; j < l /2 ; j++)
            {
                if(s.charAt(j)=='.')
                {
                    str.append(s.charAt(l-j-1));
                }
                else
                if(s.charAt(l-j-1)!='.' && s.charAt(j)!=s.charAt(l-j-1))
                {
                    System.out.println("-1");
                    flag = false;
                    break;
                }
                else
                {
                    str.append(s.charAt(j));
                }
            }
            if ( l%2 == 1 && flag)
            {
                if(s.charAt(j)=='.')
                {
                    str.append('a');
                }
                else
                {
                    str.append(s.charAt(j));
                }
                j++;
            }
            if(flag)
            {
                for ( ; j < l; j++)
                {
                    if(s.charAt(j)=='.')
                    {
                        str.append(s.charAt(l-j-1));
                    }
                    else
                    if(s.charAt(j)!=str.charAt(l-j-1))
                    {
                        System.out.println("-1");
                        flag = false;
                        break;
                    }
                    else
                    {
                        str.append(s.charAt(j));
                    }

                }
            }
            if(flag)
            {
                System.out.println(str);

            }
        }

    }
}


/*
0 1 2 3 4 5 6 7 8
l = 9
l / 2 = 4
j = 5
j = 6


 */