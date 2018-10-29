/**
 * Created by puranisu on 12/19/2017.
 */
public class TryCatchThrow {
    public static void main(String[] args) {
        TryCatchThrow tryCatchThrow = new TryCatchThrow();
        try {
            tryCatchThrow.parent(10,0);
        } catch (Exception e) {
            System.out.println("FROM MAIN. BYe NOW!");
            System.exit(0);
        }
    }
    private void parent(int a, int b ) throws Exception{
        childMethod(a,b);
    }

    private void childMethod(final int dividend, final int divisor) throws Exception{
        try {
            int result = dividend/divisor;
            System.out.println(result);
        }catch (Exception e) {
            throw e;
        }
    }
}
