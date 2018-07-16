import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer integerLength = 10;
        String str;
        Integer[] integerArray = new Integer[integerLength];
        str = in.nextLine();

        System.out.println(str);
        str = str.replace("[", "").replace("]", "").trim();
        System.out.println(str);
        String[] stringRange = str.split(";");
        Integer[] range = new Integer[2];
        Integer ii = 0;
        for (String strr : stringRange) {
            range[ii++] = Integer.parseInt(strr);
        }
        System.out.println(Arrays.toString(range));
        if (range[0] > range [1]){
            Integer temp = range[0];
            range[0] = range[1];
            range[1] = temp;
        }
        System.out.println(Arrays.toString(range));
        Random rand = new Random();
            for (Integer j = 0; j < integerLength; j++) {
                Integer rangeMin = range[0], rangeMax = range[1];
                integerArray[j] = rangeMin + rand.nextInt(rangeMax - rangeMin); // генерация случайных целых чисел в диапазоне
                System.out.println(integerArray[j]);
            }

//        System.out.println(str.replaceAll(".","*"));
    }
}
