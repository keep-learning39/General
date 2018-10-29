/**
 * Created by puranisu on 1/12/2018.
 */
public class PassBy {
    public static void main(String[] args) {
        int actual = 1;
        System.out.println("Before" + actual);
        passerMethod(actual);
        System.out.println("After" + actual);

    }

    static void passerMethod(int parameter) {
        parameter = 10;
    }
}
