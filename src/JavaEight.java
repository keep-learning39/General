import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by puranisu on 7/26/2018.
 */
public class JavaEight {

    public static void main(String[] args) {


//        https://github.com/sitepoint-editors/MapFilterReduceOperations/blob/master/src/com/github/hathibelagal/streams/Examples.java

        /*  MAP : to change each element, expects a lambda expression
            FILTER : to reduce the stream strength
            FOREACH : a consumer to be executed using each of the stream objects.




         */


        String[] strings = new String[]{"aaa","bbb","ccc"};

        Stream<String> stream = Arrays.stream(strings);
//      Or equivalent - Stream<String> stream = Stream.of(strings);

        Stream<String> upperCaseStream =  stream.map(s -> s.toUpperCase()); // has to be lambda expression in map()

        String[] upperCaseArray = upperCaseStream.toArray(String[]::new);

        Stream<String> secondStream = Arrays.stream(strings);

        secondStream.forEach(System.out::println);

        int[] integerArray = new int[]{1,2,3,4};

        Arrays.stream(integerArray)
                .filter(value -> value > 2)         // has to be a lambda which returns boolean
                .forEach(System.out::println);





        System.out.println("-------");

        // to print all the words with less than 4 characters in upper case from a list of words




        String[] listOfWords = new String[]{"one","two","three","four","five"};

        Arrays.stream(listOfWords)
                .filter(s -> s.length() < 4)
                .map(s1 -> s1.toUpperCase())
                .forEach(System.out::println);


        Arrays.stream(listOfWords)
                .filter(s -> s.length() < 4)
                .toArray(String[]::new);


        System.out.println("-------");



        // IDENTITY element : an element in the stream on which the reduce operation does not alter the element

        // Multiplication: 1, Addition:0, String : ""

        System.out.println(Arrays.stream(listOfWords)
                .reduce("", (s, s2) -> s + s2)
                .toString());

        System.out.println("-------");


        Stream<String> wordStream = Arrays.stream(listOfWords);

        IntStream lengthStream = wordStream.mapToInt(value -> value.length());

        lengthStream.forEach(System.out::println);











//        upperCaseStream.peek(s -> System.out.println("stream element: " +s));






/*
        String nullObject = null;
        if("abc".equalsIgnoreCase(nullObject)){
            System.out.println(nullObject);
        }else {
            System.out.println("false");
        }


        if(nullObject.equalsIgnoreCase("abc")){
            System.out.println(nullObject);
        }else {
            System.out.println("not a yoda");
        }*/

    }
}




/*class ScoreCollection {
    private List<Scorea>
​
        ​
        ​public​ ​void​ add(Scoreable scoreable) {
​
        scores.add(scoreable);
​
    }
}
}

​interface​ Scoreable{
        ​​int​ getScore();
}

class​  {
*/



