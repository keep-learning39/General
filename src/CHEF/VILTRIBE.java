package CHEF;
import java.util.Scanner;

/**
 * Created by puranisu on 11/8/2017.
 */
public class VILTRIBE {
    public static void main(String[] args) {
        long T , A , B , dots;
        String s;
        char c;
        int prev ;


        Scanner scanner = new Scanner(System.in);
        T = scanner.nextLong();
        while (T > 0 ){
            prev = -1;
            A = 0; B = 0; dots = 0 ;
            s = scanner.next();
            for (int j = 0; j < s.length() ; j++) {
                c = s.charAt(j);
                if(c=='A'){
                    A++;
                    if( prev == 0){
                        A+=dots;
                    }
                    prev = 0;
                    dots = 0;
                } else if (c == 'B'){
                    B++;
                    if( prev == 1){
                        B+=dots;
                    }
                    prev = 1;
                    dots = 0;
                } else {
                    if(prev!=-1){
                        dots ++;
                    }

                }
            }
            System.out.println(A+" "+B);
            T--;
        }



    }
}
