/**
 * Created by puranisu on 9/6/2018.
 */
public class PassByReference {

    public static void main(String[] args) {

        int number = 8;
        passByRef(number);
        System.out.println(number);
    }


    static void passByRef(int number){
        number++;
    }
}
