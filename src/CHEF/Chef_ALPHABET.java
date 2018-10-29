package CHEF;

import java.util.Scanner;

/**
 * Created by puranisu on 8/31/2016.
 */
class Chef_ALPHABET
{
    // https://www.codechef.com/problems/ALPHABET

    public static void main(String[] args) throws Exception
    {
        String S;
        String W;
        int N , map[];
        map = new int[26];
        for (int i = 0; i < 26; i++) {
            map[i] = 0;
        }

        Scanner scanner = new Scanner(System.in);
        S = scanner.next();

        for (int i = 0; i < S.length(); i++) {
            map[S.charAt(i)-'a']=1;
        }

        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            W = scanner.next();
            for (int j = 0; j < W.length(); j++) {
                if(map[W.charAt(j)-'a']==0)
                {
                    System.out.println("No");
                    break;
                }
                if(j==(W.length()-1))
                {
                    System.out.println("Yes");
                }
            }

        }

    }
}
