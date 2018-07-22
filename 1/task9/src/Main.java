import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file.txt");
        Scanner in = new Scanner(System.in);
        Integer amount;
        System.out.println("Введите количество строк: ");
        amount = Integer.parseInt(in.nextLine());
        String[] str = new String[amount];
        for (int i = 0; i < amount; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            str[i] = in.nextLine();
            {
                for (String task : str[i].split(" ")) {
                    fw.write(task + "\n");
                }
            }
        }
        fw.close();
    }

}
