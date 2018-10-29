/**
 * Created by puranisu on 7/19/2017.
 */
public class YodaCondition {
    public static void main(String[] args) {
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
        }
    }
}
