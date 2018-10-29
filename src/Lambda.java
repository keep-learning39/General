public class Lambda {
    public static void main(String[] args) {
        Runnable runner = () ->System.out.println("In the run() method");

        Interfacer interfacer = (String s) -> {
            System.out.println(s);
            System.out.println("Second line");
        };
        interfacer.display("a");
    }

}

interface Interfacer {
    public void display(String s);
}
