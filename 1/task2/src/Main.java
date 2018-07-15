import java.util.Random;
import java.util.Arrays;



//Импорты только сверху

public class Main {
    public static void main(String[] args) {
        Integer integerLength = 20, doubleLength = 10;
        Random rand = new Random();
        Integer[] integerArray = new Integer[integerLength];
        Double[] doubleArray = new Double[doubleLength];
        String string = "Съешь ещё этих мягких французских булок, да выпей же чаю";

        //Part 1
        for (int i=0; i < integerLength; i++) {
           integerArray[i] = rand.nextInt(100);
            System.out.print(integerArray[i] + " ");
//            System.out.printf("%d ", integerArray[i]);
        }
        System.out.println("\n");
//        System.out.println(Arrays.toString(integerArray));

        //Part 2
        for (Integer i = 0; i < doubleLength; i++) {

            Integer rangeMin = 25, rangeMax = 75;
            doubleArray[i] = rangeMin + (rangeMax - rangeMin) * rand.nextDouble(); //Возращает число от 0 до 1
            System.out.printf("%.2f\n", doubleArray[i]);
        }
        System.out.println();

        //Part 3
        for (char a: string.toCharArray() ) { //foreach example
            System.out.print(a + " ");
        }
    }
}
