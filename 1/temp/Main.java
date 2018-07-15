import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        for (int i=0; i < 20; i++) {
            int n = rand.nextInt(100);
            System.out.print(n+" ");
        }
        System.out.println();
        for (double i=0; i < 10; i++) {
            double m = rand.nextInt(51+25);
            System.out.println(m);
        }
        System.out.println("Съешь ещё этих мягких французских булок, да выпей же чаю");
    }
}
