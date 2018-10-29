import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;

/**
 * Created by puranisu on 1/6/2016.
 */
class Chef_CBALLS
{
    private static int T , N  ;
    private static int[] arr;
    public static void main(String[] args)
    {
        arr = new int[10000];

        //try {
            input();
       // }// catch (IOException e) {
          //  return;
        //}
    }
    private static void input()
            //throws IOException
    {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));*/
        //T= Integer.parseInt(reader.readLine());
        Scanner in = new Scanner(System.in);
        T= in.nextInt();
        for (int i = 0; i < T; i++)
        {
            //N = Integer.parseInt(reader.readLine());
            N = in.nextInt();
            for (int j = 0; j < N; j++) {
               //arr[j] = Integer.parseInt(reader.readLine());
                arr[j] = in.nextInt();
            }
            System.out.print(compute(N));
        }
    }

    private static int compute(int n)
    {
        int result = 0 ;
        for (int i = 0; i < n; i++)
        {
            if(i==0 && arr[i]%2!=0)
            {
                arr[i]++;
                result++;
            }
            if(i!=0)
            {
                if(arr[i]<arr[i-1])
                {
                    result += (arr[i-1]-arr[i]);
                    arr[i] = arr[i-1]  ;
                }
                else
                if(arr[i]%2 !=0)
                {
                        result++;
                        arr[i]++;
                }
            }
        }
        return  result;
    }
    private static void sort(int n)
    {
        int temp;
        for (int i = 0; i < n -1; i++)
        {
            for (int j = 0; j < n-i-1 ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
