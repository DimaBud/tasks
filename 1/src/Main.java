import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("login:");
        Scanner in = new Scanner(System.in);
        String str, str2;
        str = in.nextLine();
        System.out.println("password");
        str2 = in.nextLine();
        System.out.println("login:" + str);
        System.out.println(str2.replaceAll(".","*"));


    }
}
