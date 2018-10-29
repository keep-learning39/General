import java.io.IOException;
import java.util.Scanner;

/**
 * Created by puranisu on 2/8/2016.
 * https://www.hackerearth.com/problem/algorithm/terrible-chandu/
 *
 * handu is a bad student. Once his teacher asked him to print the reverse of a given string. He took three hours to solve it. The teacher got agitated at Chandu and asked you the same question. Can you solve it?

 Input:
 The first line contains an integer T, denoting the number of test cases.
 Each test case contains a string S, comprising of only lower case letters.

 Output:
 For each test case, print the reverse of the string S.

 Constraints:

 1 <= T <= 10
 1 <= |S| <= 30

 Sample Input(Plaintext Link)
 2
 ab
 aba

 Sample Output(Plaintext Link)
 ba
 aba


 *
 */
public class StringReverse
{
    public static void main(String[] args)
    {
        char  arr[] ;
        int i = 1 , T;

        Scanner scanner = new Scanner(System.in);

        //T = System.in.read();
        T =Integer.parseInt(scanner.nextLine());


        while (T>0)
        {
            i = 0;
            arr = new char[30];
            String str = scanner.nextLine();
            while (i<str.length())
            {
                arr[30-i-1]  = str.charAt(i);
                i++;
            }

            for (int j = 30-i; j < 30; j++)
            {
                System.out.print(arr[j]);
            }
            System.out.println("");
            T--;
        }
    }
}

