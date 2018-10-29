import java.util.Scanner;

/**
 * Created by puranisu on 2/18/2016.
 */
 class Chef_HORSES
{
    public static void main(String[] args)
    {
        int T , N  ;
        long S[] , diff = Long.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);

        T = scanner.nextInt() ;


        while ( T > 0 )
        {
            N = scanner.nextInt();
            S = new long[N];
            for (int i = 0; i < N; i++)
            {
                S[i] =  scanner.nextLong();
                for (int j = 0 ; j < i ; j++)
                {
                    if(Math.abs(S[j]-S[i]) < diff )
                    {
                        diff = Math.abs(S[j] - S[i]);
                    }
                }
            }
       //     System.out.println(sort(S, N));
            /*System.out.println("\n");
            for (int i = 0; i < N; i++)
            {
                System.out.print(S[i]+" ");
            }


*/
            System.out.println(diff);
            T--;

        }

    }
    /*public static long sort(long arr[] , int N)
    {
        long temp;
        long diff = Long.MAX_VALUE;
        for (int i = 0; i < N - 1 ; i++)
        {
            for (int j = 0; j < N - i - 1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if(arr[j+1] - arr[j]< diff)
                {
                    diff =arr[j+1] - arr[j];
                }
            }
        }
        return  diff;
    }*/
}

/*

i = 0
j = 0

1 4 9 32 13





 */