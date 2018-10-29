import java.util.Scanner;

public class KuldeepChallenge02 {

    public static void main(String[] args) {
        int[] array;
        int n, k, number, result = 0, lastNegative = -1;
        Scanner scanner = new Scanner(System.in);
        /*n = scanner.nextInt();
        k = scanner.nextInt();*/
        boolean kFound = false;
//        array = new int[n];


        array = new int[]{5,3,1,6,9,4,2,6,4,4,4,2,9};
        array = new int[]{4,4,4,4,4};
        k = 4;
        int i = 0;
        for (; i < array.length; i++) {
            number = array[i];
            array[i] = k - number;
            if (array[i] == 0) {
                kFound = true;
            } else if (array[i] < 0) {
                if (kFound == true) {
                    result += (i - lastNegative - 1);
                }
                lastNegative = i;
                kFound = false;
            }
        }
        if (kFound == true) {
            result += (i - lastNegative - 1);
        }
        System.out.println(result);
    }
}



/*

[5,3,1,6,9,4,2,6,4,4,4,2,9] , k = 4
[-1,1,3,-2,-5,0,2,-2,0,0,0,2,-5]




sum of length of sequences of positive integers which includes  at least one 0







        array = new int[]{4,4,4,4,4};


        array = new int[]{4,5,6,4,7,9,4};



//        array = new int[]{4,2,6,4,4,4,2};
//
//        array = new int[]{5,3,1,6,9,4,2,6,4,4,4,2};
 */