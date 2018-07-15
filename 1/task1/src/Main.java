import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer length  = 5;
        Integer[] nums = new Integer[length];
        for(int i=0;i < length; i++){
            nums[i]=in.nextInt();
        }
        int total = 0;
        for(int i=0;i < nums.length; i++) {
            total += nums[i];
        }
            System.out.println("Сумма элементов массива nums: " + total);

    }

}
