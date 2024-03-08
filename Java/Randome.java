import java.util.Random;
public class Randome {
    public static void main( String args[] ) {
        // create random object
        Random randomno = new Random();

        // check next int value
        System.out.println("Next int value: " + randomno.nextInt(5));
    }
}