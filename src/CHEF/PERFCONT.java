package CHEF;

import java.util.Scanner;

/**
 * Created by puranisu on 10/10/2017.
 */
public class PERFCONT {
    public static void main(String[] args) {
        double T , N , P , solved;
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextLong();
        double cakeWalk = 0 , hard = 0 ;
        while ( T > 0 ){
            N = scanner.nextLong();
            P = scanner.nextLong();
            cakeWalk = 0;
            hard = 0 ;
            for (int i = 0; i < N; i++) {
                solved = scanner.nextLong();
                if ( solved >= P * 0.5  ) {
                    cakeWalk ++;
                }
                if ( solved <= P * 0.1 ) {
                    hard ++;
                }
            }
            if ( hard == 2 && cakeWalk == 1) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            T--;
        }

    }
}

