import java.util.Arrays;

public class AsciiSorter {

    public static void main(String[] args) {
        /*String firstNum = "2919";
        String secondNum = "2920";
*/


        String[] array = {"U0001869","U0001870"};

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



    }
}
