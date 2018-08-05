import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        User[] users = getUsers();


        String login = null;
        String password = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter login");
            login = br.readLine();

            System.out.println("Enter password");
            password = br.readLine();


            CredantialsChecker checker = new CredantialsChecker();
            User user = checker.checkUser(users, login, password);

            if (user != null) {
                String receiverEmail = null;
                String subject = null;
                String emailBodyFileName = null;

                System.out.println("Enter receiver email");
                receiverEmail = br.readLine();

                System.out.println("Enter email subject");
                subject = br.readLine();

                System.out.println("Enter email bodyFile");
                emailBodyFileName = br.readLine();

                MailProcessor processor = new MailProcessor();
                processor.createAndSendMail(
                        user,
                        receiverEmail,
                        subject,
                        emailBodyFileName
                );
            } else {
                System.out.println("Invalid login or password. End.");
                return;
            }
        } catch(IOException e){
                e.printStackTrace();

        }

    }

    private static User[] getUsers() {
        User[] users = new User[3];

        users[0] = new User();
        users[0].setLogin("abra");
        users[0].setPassword("kadabra");
        users[0].setEmail("abra@kadabra.com");

        users[1] = new User();
        users[1].setLogin("ahalay");
        users[1].setPassword("mahalay");
        users[1].setEmail("ahalay@mahalay.com");


        users[2] = new User();
        users[2].setLogin("avada");
        users[2].setPassword("kedavra");
        users[2].setEmail("avada@kedavra.com");
        return users;
    }
}
