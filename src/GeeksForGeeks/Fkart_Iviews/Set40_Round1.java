package GeeksForGeeks.Fkart_Iviews;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by puranisu on 4/27/2016.
 */
public class Set40_Round1
{
    //http://www.geeksforgeeks.org/flipkart-interview-experience-set-40-for-sde-1/

    static int parentOf[] , childOf[] , map[][];

    public static void main(String[] args)
    {
        parentOf = new int[26];
        childOf = new int[26];
        map = new int[27][26];
        Arrays.fill(parentOf, 0);
        Arrays.fill(childOf, 0);
        for (int i = 0; i < 26; i++)
        {
            Arrays.fill(map[i] , 0);
        }
        Arrays.fill(map[26], -1);
        input();
        display();

        if(check2Children()==-1)
        {
            System.out.println(" MORE THAN 2 CHILDREN");
        }
        else
        {
            System.out.println(" NOTTTT MORE THAN 2 CHILDREN");
        }

        /*int ret = checkCycle();

        System.out.println("\n\n\n XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\n\n");
        display();

        if(ret == 1)
        {
            System.out.println( " CYCLE");
        }
        else
        {
            System.out.println(" NOT A CYCLE");
        }*/
    }

    public  static void input()
    {
        Scanner scanner = new Scanner(System.in);
        String inputExpression = scanner.nextLine();


        int i  = 0 ,parent  = -1 , child =-1;

        //System.out.println(inputExpression);

        while (i < inputExpression.length())
        {
            if(inputExpression.charAt(i)=='(')
            {
                parent = -1 ;
                child = -1 ;
                while (inputExpression.charAt(i)!=')')
                {
                    if(inputExpression.charAt(i)>='A' && inputExpression.charAt(i)<='Z')
                    {
                        if(parent==-1)
                        {
                            parent = inputExpression.charAt(i)-'A';
                            System.out.println("\n\nparent : " +   parent);
                        }
                        else
                        {
                            child = inputExpression.charAt(i)-'A';
                            System.out.println("child : " + child);
                        }

                        if(map[26][inputExpression.charAt(i)-'A']==-1)
                        {
                            map[26][inputExpression.charAt(i)-'A'] = 1;
                        }
                    }
                    i++;
                }
                if(parent!=-1 && child!=-1)
                {
                    parentOf[child]++;
                    childOf[parent]++;
                    map[parent][child]++;
                }

            }
            i++;
        }
    }
    public static  void  display()
    {
        System.out.println("PARENT : ");

        for (int i = 0; i < 26; i++)
        {
            System.out.print(parentOf[i]);
        }
        System.out.println("\n\n\nCHILD : ");

        for (int i = 0; i < 26; i++)
        {
            System.out.print(childOf[i]);
        }
        System.out.println("\n\n\nMATRIX");
        System.out.print(" 0 ");


        for (int j = 0; j < 26; j++)
        {
            System.out.print((char)('A' + j) +"  ");
        }

        System.out.println("");

        for (int i = 0; i < 26; i++)
        {
            System.out.print((char)('A' + i) +"  ");

            for (int j = 0; j < 26; j++)
            {
                System.out.print(map[i][j] +"  ");
            }
            System.out.println();
        }

    }
    public  static  int checkCycle()
    {
        for (int i = 0; i < 26; i++)
        {
            for (int j = 0; j < 26; j++)
            {
                if(map[26][j]==1)
                {
                    if(map[i][j]==1)
                    {
                        for (int k = 0; k < 26; k++)
                        {
                            if(map[j][k]==1)
                            {
                                map[i][k]=1;
                            }
                        }
                    }
                }

            }
        }

        for (int i = 0; i < 26; i++)
        {
            if(map[i][i]==1)
            {
                return 1;
            }
        }
        return  -1;
    }

    public  static  int check2Children()
    {
        int sum = 0;
        for (int i = 0; i < 26 ; i++)
        {
            sum = 0 ;
            for (int j = 0; j < 26; j++)
                {
                    if(map[i][j]>=1)
                    {
                        sum++;
                    }
                }
                if(sum > 2)
                {
                    return  -1;
                }
        }
        return  1;
    }

}

/*


0 is parent of 1 and 2
1 is parent of 3 and 6
2 is parent of 4 and 7

         A
       B   C
      G D  E H
           F





 */