package CHEF;

import java.util.Scanner;

/**
 * Created by puranisu on 10/6/2017.
 */
public class CHEFPDIG {
    public static void main(String[] args) {
        long T ;
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextLong();
        String input;
        while (T>0){
            input = scanner.next();
            T--;
            System.out.println(process(input));
        }
    }
    private static String process(final String input){
        StringBuilder output = new StringBuilder();
        int characterMap[] = new int[35];
        int digits[] = new int[10];
        int digit;
        for (int i = 0; i < input.length(); i++) {
            digit = input.charAt(i) - '0';
            digits[digit]++;
        }


        for (int i = 65; i <100 ; i++) {
            String ascii = Integer.toString(i);
            int ascii1 , ascii2 ;
            ascii1 = Integer.parseInt(String.valueOf(ascii.charAt(0)));
            ascii2 = Integer.parseInt(String.valueOf(ascii.charAt(1)));
            if ( digits[ascii1]!=0 && digits[ascii2]!=0 ){
                if (ascii1 == ascii2 ) {
                    if ( digits[ascii1] >=2 ) {
                        characterMap[i-'A']=1;
                    }
                } else {
                    characterMap[i-'A'] = 1;
                }
            }
        }
        char ch ;
        for (int i = 0; i < 26; i++) {
            if ( characterMap[i] != 0 ){
                int ascii = 'A' + i;
                ch = (char) ascii;
                output.append(ch);
            }
        }
        return output.toString();
    }
}
