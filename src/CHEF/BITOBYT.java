package CHEF;

import java.util.Scanner;

public class BITOBYT {
    /*
    In the magical land of Byteland, there are three kinds of citizens:
    a Bit - 2ms
after a Bit appears, it grows up and becomes a Nibble (i.e. it disappears and a Nibble appears)
a Nibble - 8ms
after a Nibble appears, it grows up and becomes a Byte
a Byte - 16ms
    after a Byte appears, it grows up, splits into two Bits and disappears
Chef wants to know the answer to the following question: what would the population of Byteland be immediately before the time Nms
if only 1 Bit appeared at time 0ms?
Example Input
2
2
3
Example Output
1 0 0
0 1 0
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int input, bits,  nibbles, bytes;
        while (n > 0) {
            input = scanner.nextInt();
            bytes = input / 10;
            input = input %16;
            nibbles = input / 8;
            input = input % 8;
            bits = input /2;
            System.out.println(bits + " "+ nibbles +" "+bytes);
            n--;
        }
    }
}