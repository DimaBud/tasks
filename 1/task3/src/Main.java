import java.util.Scanner;
import java.lang.Integer;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str,str2;
        str = in.nextLine();
        System.out.println(str);
        str2 = in.nextLine();

        if (str.contains(str2)){
            System.out.println("Строка " + str + " содержит строку " + str2);
        }
        else {
            System.out.println("Строка " + str + " не содержит строку " + str2);
            String temp = "";
            for ( Character a : str2.toCharArray() ) {
                if (str.contains(a.toString()) && !temp.contains(a.toString())) {
                    temp = temp + a.toString();
                }
            }
            System.out.print("Но содержит символы из неё: ");
            for (char a: temp.toCharArray() ) {
                System.out.print(a + " ");
            }
        }
    }
}
