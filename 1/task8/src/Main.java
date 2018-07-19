import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter( "file.txt" );
        for (int i = 0; i < 255; i++){
            fw.write(i + "\t" + (char) i + "\t");
            if ( (i + 1) % 3 == 0){ // && = and; || = or; == = equals; ! = not
                fw.write("\n");
            }
        }
        fw.close();

        FileReader fr = new FileReader( "file.txt" );
        Scanner scan = new Scanner(fr);

        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
            i++;
        }
        System.out.println("Total lines: " + i);
        fr.close();




//    JFileChooser fc = new JFileChooser();{
//        FileReader fr = new FileReader(fc.getSelectedFile());
//        BufferedReader br = new BufferedReader(fr);
//        File file = new File("task8");
//        try {
//            if (!file.exists()) {
//                file.createNewFile();
//                PrintWriter out = new PrintWriter(file.getAbsoluteFile());
//                Scanner in = new Scanner(System.in);
//                String e;
//                StringBuilder text = new StringBuilder();
//                String str = in.nextLine();
//                while ((str = br.readLine()) != null) {
//                    System.out.println(str + "\n");
//                    text.append(str);
//                    text.append('\n');
//                    JEditorPane textPane;
//                    textPane.setText(text.toString());
//                }
//            }
//        } catch(IOException e){
//                    throw new RuntimeException(e);
//        }finally{
//            if (br != null) {
//                br.close();
//            }
//            System.out.println(str);
//        }
    }
}