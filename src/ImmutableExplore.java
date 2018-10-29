import java.util.Date;

/**
 * Created by puranisu on 9/8/2017.
 */
public class ImmutableExplore {
    public static void main(String[] args) {
        int memberInteger = 10;
        Date today = new Date(System.currentTimeMillis());
        int id = 1234;
        MemberClass m = new MemberClass(id);
        ImmutableClass immutableClass = new ImmutableClass(memberInteger,today,m);
        System.out.println(immutableClass.getMemberInt());
        System.out.println(immutableClass.getDob());
        System.out.println(immutableClass.getMemberClass());
        id = 5678;
        m.setID(id);

        memberInteger = 100;

        today.setTime(today.getTime()+1000000);

        int a = immutableClass.getMemberInt() ;
        a = 9999;

        System.out.println(immutableClass.getMemberInt());
        System.out.println(immutableClass.getDob());
        System.out.println(immutableClass.getMemberClass());
    }

}
class ImmutableClass {
    public int getMemberInt() {
        return memberInt;
    }
    public Date getDob() {
        return dob;
    }
    public MemberClass getMemberClass() {
        return memberClass;
    }
    private final int memberInt ;
    private final Date dob;
    private final MemberClass memberClass;

    public ImmutableClass(int i, Date d, MemberClass m ){
        memberInt = i;
        dob = d;
        memberClass = m;
    }
}

class MemberClass {
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private int ID ;
    public MemberClass(int i){
        ID = i;
    }

    public String toString() {
        return Integer.toString(ID);
    }
}
