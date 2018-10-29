package Algos;

import java.util.Scanner;

/**
 * Created by puranisu on 3/9/2016.
 */
public class BinarySearchTree
{

    public static void main(String[] args)
    {
        int ArrayLength ;
        int IntegerList[] ;

        Scanner scanner = new Scanner(System.in);
        ArrayLength = scanner.nextInt();

        IntegerList = new int[ArrayLength];

        for (int i = 0; i < ArrayLength; i++)
        {
            IntegerList[i]= scanner.nextInt();
        }

    }
}
