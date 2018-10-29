public class AshaChallenge01 {
    static char[] output;
    static int pointer = 0;

    public static void main(String[] args) {
        output = new char[256];
//        String input = "cbbbaaaabbbccc";
        String input = "azzzxxzyyyddddyzzz";
//        String input = "yyyzzz";
//        System.out.println(process(input));
        String oldString = input;
        while (true){
            stackProcess(input);
            output[pointer] = '\0';
            oldString = input;
            input = String.valueOf(output).substring(0,pointer);
            if(input.equalsIgnoreCase(oldString)){
                break;
            }
            pointer = 0;
        }
        System.out.println(String.valueOf(output).substring(0,pointer)+"!");
    }

    private static void stackProcess(final String input) {
        int sameCharCount = 1, i = 1;
        push(input.charAt(0));
        while (i < input.length()) {
            if (input.charAt(i) != output[pointer - 1]) {
                if (sameCharCount % 2 == 0) {
                    pop(sameCharCount);
                }
                sameCharCount = 1;
            } else {
                sameCharCount++;
            }
            push(input.charAt(i));
            i++;
        }
    }

    private static void push(final char ch) {
        output[pointer] = ch;
        pointer++;
    }

    private static void pop(final int sameCharCount) {
        pointer -= sameCharCount;
    }

    static String process(String string) {
        int count;
        int i = 0, length = string.length(), j;
        String tail, head;
        while (i < length) {
            count = 1;
            for (j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) != string.charAt(j)) {
                    if (count % 2 == 0) {
                        tail = string.substring(j);
                        head = string.substring(0, i);
                        string = new String(head + tail);
                        return process(string);
                    }
                    i = j;
                    break;
                } else {
                    count++;
                }
            }
            if (j == length) {
                if (count % 2 == 0) {
                    return string.substring(0, i);
                } else {
                    return string;
                }
            }
        }
        return string;
    }
}






/*



aaabbcc
0123456




abccccd
0123456

i = 2
j = 6


Given a string, iteratively remove consecutive duplicate characters of even count from the string, starting from the front.
The output string should not have any consecutive duplicate characters of even count.
ex: input : azzzxxzyyyddddyzzz output : azzz
input : yyyzzz  output : yyyzzz  --no change since odd number of chars
input : cbbbaaaabbbccc  output : empty string




aabbbcccdddc




 */


