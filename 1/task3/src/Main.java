import java.util.Scanner;
import java.lang.Integer

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer length = 5;
        Integer integerLength = 5;
        Integer[] integerArray = new Integer[integerLength];
        Integer[] nums = new Integer[length];
        for (int i = 0; i < 20; i++) {
            nums[i] = in.nextInt();
            System.out.println(nums[i]);
            Integer[] n = new Integer[integerLength];
            for (int k = 0; k < 20; k++) {
            n[k]= in.nextInt();
            }
            int k = 0;
            System.out.println(nums[i].equalsIgnoreCase(n[k]));
            if false 


    }
}
