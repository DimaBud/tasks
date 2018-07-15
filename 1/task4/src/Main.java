import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        str = in.nextLine();

        System.out.println(str);
        str = str.replace("[", "").replace("]", "").trim();
        System.out.println(str);
        String[] stringRange = str.split(";");
        Integer[] range = new Integer[2];
        Integer i = 0;
        for (String strr : stringRange) {
            range[i++] = Integer.parseInt(strr);
        }
        System.out.println(Arrays.toString(range));
        if (range[0] > range [1]){
            Integer temp = range[0];
            range[0] = range[1];
            range[1] = temp;
        }
        System.out.println(Arrays.toString(range));
        Random rand = new Random();
//        System.out.println(str.replaceAll(".","*"));
    }
}
