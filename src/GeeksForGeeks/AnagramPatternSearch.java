package GeeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by puranisu on 3/30/2016.
 */
public class AnagramPatternSearch
{
//http://www.geeksforgeeks.org/anagram-substring-search-search-permutations/

    public static void main(String[] args)
    {
        int T , result;
        String text , word;

        int window[] ;
        int wordCount[];

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        window = new int[26];
        wordCount = new int[26];

        try {


            while (T > 0) {
                result = 0;
                text = scanner.next();
                word = scanner.next();

                Arrays.fill(window, 0);
                Arrays.fill(wordCount, 0);

                computeWord(word, wordCount, text, window);
                if (compare(wordCount, window) == 1) {
                    result++;
                }

                for (int i = word.length(); i < text.length(); i++) {
                    window[text.charAt(i - word.length()) - 'a']--;
                    window[text.charAt(i) - 'a']++;

                    if (compare(wordCount, window) == 1) {
                    /*for (int j = i-word.length();   j < i; j++)
                    {
                        System.out.print(text.charAt(j));
                    }
                    System.out.println("\n");*/
                        result++;
                    }


                }
                System.out.println(result);
                T--;
            }
        }catch (Exception e)
        {

        }


    }
    public  static  void  computeWord(String word , int count[] , String text , int window[])
    {
        for (int i = 0; i < word.length(); i++)
        {
            count[word.charAt(i)-'a']++;
        }
        for (int i = 0; i < word.length(); i++)
        {
            window[text.charAt(i)-'a']++;
        }
    }
    public  static  int compare(int word[], int window[] )
    {
        for (int i = 0; i < 26; i++)
        {
            if(word[i]!=window[i])
            {
                return  -1;
            }
        }
        return  1 ;
    }
}
