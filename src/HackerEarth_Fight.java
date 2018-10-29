import java.util.Scanner;

/**
 * Created by puranisu on 2/16/2016.
 */
public class HackerEarth_Fight
{
    /*


    Fatal Eagle has had it enough with Arjit aka Mr. XYZ who's been trying to destroy the city from the first go.
    He cannot tolerate all this nuisance anymore. He's... tired of it. He decides to get rid of Arjit and his allies in a war.
    He knows that Arjit has N people fighting for him,
    so he brings his own N people in the war to face him. (So, there will be 2 * N people fighting in this war!)

He knows for him to win the war against his enemy, members of his army should be present before the members of Arjit come up in the battlefield -
that is to say, whenever a member of Arijt's army comes in the battlefield, there should already be a member of his own army there to handle him.
(In short, the number of his army members should never be less than the number of Arjit's army members in the field!)

If he figures out the number of ways such such sequences can be formed, the good will be able to conquer evil yet again.
Help Fatal Eagle in figuring it out to defeat Arjit - once and for all.

Input format:
There is only one integer in the only line of the input, denoting the value of N.

Output format:
Print the number of valid sequences. Since the output might be very big, print it modulo 109+9.

Constraints:
1 <= N <= 105

SAMPLE INPUT
3
SAMPLE OUTPUT
5
     */


    public static void main(String[] args)
    {
        int N =1 ;
        long result = 0;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        double lower = Math.pow(2,(double)N);
        lower--;
        double upper = Math.pow(2,(double)N * 2);

        for (double i = lower  ; i <= upper; i+=2)
        {
            if( toBinary((int)i,N) ==1)
            {
                result++;
            }
        }

        //System.out.println(toBinary(55, 3)) ;
        //toBinary(55, 3);
        System.out.println(result%1000000009);

    }
    public  static  int toBinary(int decimal , int N)
    {
        int ones = 0 , excess = 0 ;
        int remainder;
        while(decimal>0)
        {
            remainder = decimal % 2 ;
            if(remainder == 1 )
            {
                ones ++;
                if(ones > N)
                {
                    return  -1;
                }
                excess ++;
            }
            else
            {
                excess --;
            }
            if(excess < 0 )
            {
                return  -1 ;
            }
            decimal/=2;
        }
        return  1;
    }
}


/*

6 - 63

000111 = 7
001011 = 11
010011 = 19
100011 = 25
001110 = 14
011100 = 29
111000 = 56



011111 = 31


3 3
1 -> 2
2 -> 3
1 -> 3


3 -> 2
1  2
1 3
5 4
1 3
2 3
3 4
2 5


 */