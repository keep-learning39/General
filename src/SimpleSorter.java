import java.util.Scanner;

/**
 * Created by puranisu on 11/18/2016.
 */
public class SimpleSorter {
    public static void main(String[] args) {
        int array[] ;

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] =  scanner.nextInt();
        }

        sortArray(array);



        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }



    }
    public  static  void  print(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }
    public static void sortArray(int[] array){
        int length = array.length , temp ;

        for (int i = 0; i < length ; i++) {
            for (int j = i+1; j < length ; j++) {
                if ( array[j-1] > array[j] )
                {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
                print(array);
            }
        }
    }
}
/*
First pass
5 1 4 2 8
1 5 4 2 8




i = 0
j = 2

 */