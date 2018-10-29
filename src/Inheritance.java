/**
 * Created by puranisu on 2/13/2018.
 */
public class Inheritance {
    public static void main(String[] args) {
        SuperClass superObject = new SubClass(29,11);
//        superObject.subMember = 1;
        System.out.println();

    }
}
class SuperClass {
    int superMember;
    SuperClass(int a) {
        superMember = a;
    }
}
class SubClass extends SuperClass {
    public int subMember;
    SubClass(int a, int b ){
        super(b);
        subMember = a;
    }

}