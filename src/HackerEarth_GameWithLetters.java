import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by puranisu on 3/1/2016.
 */
public class HackerEarth_GameWithLetters
{

    /*
    https://www.hackerearth.com/problem/algorithm/g-game-with-letters/

     */

    public static void main(String[] args)
    {
        int T , totalTeams , iThTeam , length  , l , ch , answer =0  , totalSum ;
        String str ;
        int matrix[] ;
        int total[] , teamStrength[];

        Scanner scanner = new Scanner(System.in);

        T = scanner.nextInt();

        while ( T > 0 )
        {
            totalTeams = scanner.nextInt();
            iThTeam = 0 ;
            matrix = new int[27];

            total = new int[totalTeams];
            teamStrength = new int[totalTeams];


            Arrays.fill(matrix, 0);
            Arrays.fill(total , 0);
            Arrays.fill(teamStrength , 0);

            str = scanner.next();
            length = str.length();
            l = 0 ;
            while ( l < length )
            {
                ch = str.charAt(l)-'a';
                matrix[ch]++;
                l++;
            }
            while (iThTeam < totalTeams )
            {
                str = scanner.next();
                length = str.length();
                teamStrength[iThTeam] = length;
                l = 0 ;
                while ( l < length )
                {
                    ch = str.charAt(l)-'a';
                    total[iThTeam] += ( matrix[ch] );
                    l++;
                }
                iThTeam ++;
            }


            totalSum  = Integer.MIN_VALUE;
            for (int i = 0; i < totalTeams; i++)
            {
                if( total[i] > totalSum)
                {
                    totalSum = total[i];
                    answer = i;
                }
                else
                if(total[i] == totalSum)
                {
                    if(teamStrength[i] < teamStrength[answer])
                    {
                        answer = i;
                    }
                    else
                    if(teamStrength[i] == teamStrength[answer] && i < answer )
                    {
                        answer = i;
                    }
                }
            }
            System.out.println(answer+1);

            T--;
        }

    }
}
