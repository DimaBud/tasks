import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer amount ;
        System.out.println("Введите количество строк: ");
        amount = Integer.parseInt(in.nextLine());

//        String str, str2, str3, str4, str5;
//        System.out.print("Строка 1: ");
//        str = in.nextLine();
//        System.out.print("Строка 2: ");
//        str2 = in.nextLine();
//        System.out.print("Строка 3: ");
//        str3 = in.nextLine();
//        System.out.print("Строка 4: ");
//        str4 = in.nextLine();
//        System.out.print("Строка 5: ");
//        str5 = in.nextLine();
//        String[] stroki = new String[]{str, str2, str3, str4, str5};
        String[] stroki = new String[amount];
        for (int i = 0; i < amount; i++){
            System.out.print("Строка " + (i + 1) + ": ");
            stroki[i] = in.nextLine();
        }
        for (int i = 0; i < stroki.length - 1; i++) {
            String temp;
//            System.out.println(stroki[i].compareTo(stroki[i+1]));
            for (int j = 0; j < stroki.length - i - 1; j++){
                if (stroki[j].length() > stroki[j+1].length()){
                    temp = stroki[j];
                    stroki[j] = stroki[j + 1];
                    stroki[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(stroki));
        System.out.println("Another example:");

        ArrayList<String> strings = new ArrayList<String>();
        System.out.println("Enter amount of strings: ");
        Integer stringsAmount = Integer.parseInt(in.nextLine());
        System.out.println("Enter strings: ");
        for (int i = 0; i < stringsAmount; i++){
            strings.add(in.nextLine());
        }
//        Collections.sort(strings, String::compareTo);
//        Collections.sort(strings, Comparator.naturalOrder());
        Collections.sort(strings, (lhs, rhs) -> lhs.compareTo(rhs));
        System.out.println(strings.toString());
    }

}