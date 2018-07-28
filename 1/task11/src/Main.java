import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        do {
        int theNumber = (int) (Math.random() * 200 - 100);
        int cars = 0;
        int numberOfTries = 0;
        while (cars != theNumber) {
            System.out.println("Угадайте количество машин от -100 до 100: ");
            cars = scan.nextInt();
            numberOfTries = numberOfTries + 1;
            if (cars < theNumber)
                System.out.println(cars + " Слишком мало. Попробуйте еще раз.");
            else if (cars > theNumber)
                System.out.println(cars + " Слишком много. Попробуйте еще раз.");
            else
                System.out.println(cars + " Верно! Вы победили. " + " Вы отгадали число за " + numberOfTries + " попыток.");
        }
            System.out.println("Хотите сыграть еще раз(да/нет)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("да"));
            System.out.println("Спасибо за игру. Пока");


    }
}
