import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] words = str.split("\\s");
        for(String subStr:words) {
            int wordCount = 0;
            Integer i, wordsSize = words.length, strSize = str.length();
            for (i = 0; i < wordsSize; ++i)
                if (words[i] != null && !"".equals(words[i]))
                    ++wordCount;
            if (wordCount <=1)
                System.out.println("Невозможно разделить строку на подстроки");
            System.out.println(subStr);
        //char[] strToArray = str.toCharArray();
        //for(int i = 0; i < strToArray.length; i++) {
            //if (i > 1)
                //System.out.println(strToArray[i] + " ");
            //if (i <= 1)
                //System.out.println("Невозможно разделить строку на подстроки");
        }
    }
}
