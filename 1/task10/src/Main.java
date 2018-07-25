import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file.txt");
        System.out.println("Введите количество строк: ");
        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        Integer amountOfLines = Integer.parseInt(console.nextLine());
        for (int i = 0; i < amountOfLines; i++){
            for(int j = 0; j < 10; j++){
                int lenStr = 3 + rand.nextInt(4);
                String tempString = "";
                for (int k = 0; k < lenStr; k++){
                    Integer tempInt = rand.nextInt(9);
                    tempString += tempInt.toString();
                }
                fw.write(tempString + " ");
            }
            fw.write("\n");
        }
        fw.close();
        fw = new FileWriter("file2.txt");
        FileReader fr = new FileReader("file.txt");
        Scanner scan = new Scanner(fr);
        System.out.println("Введите строку для поиска: ");
        String search = console.nextLine().trim();
        while (scan.hasNextLine()) {
            String tempString = scan.nextLine().trim();
            String[] tempStringArray = tempString.split(" ");
            for (String str: tempStringArray) {
                tempString = str.contains(search) ? (str + " ") : "";
                fw.write(tempString);
            }

        }
        fr.close();
        fw.close();
    }
}

