package CHEF;

import java.util.Scanner;

public class CHEFROUT {
    public static void main(String[] args) {
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            boolean result = true;
            String s = scanner.next();
            char prev = s.charAt(0) , current ;
            for (int j = 1; j < s.length(); j++) {
                current = s.charAt(j);
                if(current - prev < 0) {
                    result = false;
                    break;
                }
                prev = current;
            }
            if(result == true){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
