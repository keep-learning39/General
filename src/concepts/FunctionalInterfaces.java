package concepts;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        FunctionalInterfaceExample object = (String s) -> {             // LAMBDA!!
            System.out.println(s);
            return true;
        };
        System.out.println(object.interfaceMethod("New String"));
    }
}
@FunctionalInterface
interface FunctionalInterfaceExample {
    boolean interfaceMethod(String s);
//    void secondMethodNotAllowedBecauseOfThisAnnotation();
}
