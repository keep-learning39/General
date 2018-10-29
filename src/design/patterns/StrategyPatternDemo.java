package design.patterns;

public class StrategyPatternDemo {
    public static void main(String[] args) {

    }

    abstract class Duck {
        FlyingBehavior flyingBehavior;
        QuackBehavior quackBehavior;

        public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
            this.flyingBehavior = flyingBehavior;
        }

        public void setQuackBehavior(QuackBehavior quackBehavior) {
            this.quackBehavior = quackBehavior;
        }

        public Duck(){}
/*
        Duck(FlyingBehavior flyingBehavior, QuackBehavior quackBehavior) {
            this.flyingBehavior = flyingBehavior;
            this.quackBehavior = quackBehavior;
        }
*/

        abstract void display();

        void letsFly() {
            flyingBehavior.fly();
        }

        void letsQuack() {
            quackBehavior.quack();
        }
        final void swim(){
            System.out.println("We can all swim !!");
        }
    }

    class FlyWithWings implements FlyingBehavior {

        @Override
        public void fly() {
            System.out.println("Fly fly flap flap!");
        }
    }
    class Squeek implements QuackBehavior {

        @Override
        public void quack() {
            System.out.println("Squeek squeek");
        }
    }

    interface FlyingBehavior {
        void fly();
    }

    interface QuackBehavior {
        void quack();
    }

    class IndianDuck extends Duck {
        @Override
        void display() {
            System.out.println("Hamsa");
        }

        IndianDuck(){
            flyingBehavior = new FlyWithWings();
            quackBehavior = new Squeek();
        }

    }
}
