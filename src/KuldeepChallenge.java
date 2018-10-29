import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class KuldeepChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), number;
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            number = scanner.nextInt();
            array[i] = String.valueOf(number);
        }
        Arrays.sort(array, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
        }
    }
}
