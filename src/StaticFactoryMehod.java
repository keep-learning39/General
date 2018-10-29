/**
 * Created by puranisu on 1/5/2018.
 */
public class StaticFactoryMehod {
    static class Color {
        private final int hex;
        Color(String rgb) {
            this(Integer.parseInt(rgb, 16));
        }
        Color(int red, int green, int blue) {
            this(red << 16 + green << 8 + blue);
        }
        Color(int h) {
            this.hex = h;
        }

        public static Color factoryMethod(int red, int green, int blue) {
            return new Color(red, green, blue);
        }
    }

    public static void main(String[] args) {
        Color color = new Color("A");
        System.out.println(color.hex);
        Color color1 = Color.factoryMethod(1,2,3);
    }
}
