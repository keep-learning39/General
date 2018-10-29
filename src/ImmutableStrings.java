/**
 * Created by puranisu on 9/8/2017.
 */
public class ImmutableStrings {
    public static void main(String[] args) {
        String string = "abcd" ;
        StringBuilder builder = new StringBuilder();
        builder.append("building ");
        Foo foo = new Foo(string, builder);
        StringBuilder sbb = foo.getNameBuilder();
        System.out.println("Builder : "+foo.getNameBuilder().toString());
        System.out.println("Name : "+foo.getName());
        sbb.append("appending!");
        System.out.println("After appending");
        System.out.println("Builder : " + foo.getNameBuilder().toString());
        System.out.println("Name : "+foo.getName());

        /*
    Builder : building
    Name : abcd
    After appending
    Builder : building appending!
    Name : abcd
     */

    }



}
class Foo {
    public String getName() {
        return name;
    }

    private final String name ;

    public StringBuilder getNameBuilder() {
        return nameBuilder;
    }

    private final StringBuilder nameBuilder;

    Foo(String name, StringBuilder nameBuilder) {
        this.name = name;
        this.nameBuilder = nameBuilder;
    }
}
