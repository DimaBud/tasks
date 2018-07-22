import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file.txt");
        Scanner scan = new Scanner(fr);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
            i++;
            FileWriter fw = new FileWriter("file2.txt");
            Scanner in = new Scanner(System.in);
            String str;
            str = in.nextLine().trim();
            if (scan.nextLine().contains(str)) {
                String temp = "";
                for (Character a : str.toCharArray()) {
                    if (str.contains(a.toString()) && !temp.contains(a.toString())) {
                        temp = temp + a.toString();
                    }
                }
                for (char a : temp.toCharArray()) {
                    System.out.print(a + " ");
                    //fw.write();

                }
                fr.close();
                fw.close();
            }
        }
    }

