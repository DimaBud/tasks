import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        File file = new File(task8);
        try {
            if(!file.exists()) {
                file.createNewFile();
                PrintWriter out = new PrintWriter(file.getAbsoluteFile());
                
             finally {

                }
                out.close();
            }
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }

    }
}
