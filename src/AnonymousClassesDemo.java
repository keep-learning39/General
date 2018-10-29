public class AnonymousClassesDemo {

    class TopLevelClass {
        void topLevel() {
            System.out.println("In the top level class");
        }

        final void finalMethod() {
            System.out.println("-- In the final method -- ");

        }
    }


    abstract class AbstractClass {
        String name;

        AbstractClass(String name) {
            this.name = name;
        }

        abstract void abstractMethod();
    }

    void demo() {
        AbstractClass abstractClassObject = new AbstractClass("s") {
            @Override
            void abstractMethod() {
                System.out.println("Abstract Method = " + name);
            }
        };
        abstractClassObject.abstractMethod();

        AbstractInterface abstractInterface = new AbstractInterface() {
            @Override
            public void implementAlgorithm(String s) {
                System.out.println("In the interface " + s);
            }
        };
        abstractInterface.implementAlgorithm("<< string input >>");


        AbstractInterface abstractInterfaceLambda = (String s) -> {
            System.out.println("In the interface " + s);
        };
        abstractInterfaceLambda.implementAlgorithm("Lambda expression");

        TopLevelClass topLevelClass = new TopLevelClass() {
            @Override
            void topLevel() {
                super.topLevel();
                System.out.println("Over-riding the top level class by an anonymous class");
            }
        };

        topLevelClass.topLevel();
    }

    public static void main(String[] args) {
        AnonymousClassesDemo anonymousClassesDemo = new AnonymousClassesDemo();
        anonymousClassesDemo.demo();
    }

    interface AbstractInterface {
        void implementAlgorithm(String s);
    }
}
