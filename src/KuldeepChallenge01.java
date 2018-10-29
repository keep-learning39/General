import java.util.Random;
public class KuldeepChallenge01 {
    static int[] list = {99,1,2,98,3,97,4,96};
    static int size = list.length, sizeCount = size;

    public static void main(String[] args) {
            System.out.println(randomChoice());
    }
    static int randomChoice(){
        Random random = new Random();
        int n , randomNum = random.nextInt(sizeCount);
        n = list[randomNum];
        list[randomNum] = list[sizeCount-1];
        list[sizeCount-1] = n;
        sizeCount--;
        if(sizeCount == 0 ){
            sizeCount = list.length;
        }
        return n;
    }
}
