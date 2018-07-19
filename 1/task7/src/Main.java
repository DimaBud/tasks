import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first line with some delimiter (one or more, but the same):");
        String str = in.nextLine().trim();
        System.out.println("Enter delimiter:");
        String delimiter = in.nextLine();
        String[] words;
        if (str.contains(delimiter)){
            words = str.split(delimiter);
            System.out.println("Array of strings after division:");
            System.out.println(Arrays.toString(words));
        }
        else{
            System.out.println("ERROR: It is impossible to split a string with this delimiter.");
        }
    }
}
