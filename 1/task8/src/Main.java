import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args);
    JFileChooser fc = new JFileChooser();{
        FileReader fr = new FileReader(fc.getSelectedFile());
        BufferedReader br = new BufferedReader(fr);
        File file = new File("task8");
        try {
            if(!file.exists()) {
                file.createNewFile();
                PrintWriter out = new PrintWriter(file.getAbsoluteFile());
                Scanner in = new Scanner(System.in);
                String e;
                StringBuilder text = new StringBuilder();
                String str = in.nextLine();
                while ((str = br.readLine()) != null) {
                    System.out.println(str + "\n");
                    text.append(str);
                    text.append('\n');
                    JEditorPane textPane;
                    textPane.setText(text.toString());
        }catch(IOException e){
                    throw new RuntimeException(e);
        }finally{
                            if (br != null) {
                                br.close();
                            }
                            System.out.println(str);
                        }
                    }

                }
    }
}
