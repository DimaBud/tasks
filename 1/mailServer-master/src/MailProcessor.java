import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MailProcessor {
    public void createAndSendMail(
            User senderUser,
            String receiverEmail,
            String subject,
            String emailBodyFileName
    ) {

        Mail mail = createMail( senderUser, receiverEmail, subject, emailBodyFileName);
        send(mail);

    }

    private void send(Mail mail) {
        StringBuilder sb = new StringBuilder("");

        sb.append("From:  ").append(mail.getSender()). append("\n");
        sb.append("To:  ").append(mail.getReceiver()). append("\n");
        sb.append("Subject:  ").append(mail.getSubject()). append("\n");
        sb.append("MailBody:  ").append(mail.getMailBody());

        System.out.println(sb.toString());

    }

    private Mail createMail(
            User senderUser,
            String receiverEmail,
            String subject,
            String emailBodyFileName) {

        Mail mail = new Mail();

        String senderEmail = senderUser.getEmail();
        mail.setSender(senderEmail);

        mail.setReceiver(receiverEmail);
        mail.setSubject(subject);

        List<String> mailBody = getMailBoby(emailBodyFileName);
        mail.setMailBody(mailBody);

        return mail;

    }

    private List<String> getMailBoby(String emailBodyFileName) {
        String line = null;
        List<String> mailBody = new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader(emailBodyFileName))) {

            while ( (line = br.readLine()) != null ){
                mailBody.add(line);
            }

        } catch ( IOException e) {
            e.printStackTrace();
        }

        return mailBody;
    }
}
