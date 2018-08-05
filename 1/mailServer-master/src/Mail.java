import java.util.List;

public class Mail {
    private String sender;
    private String receiver;
    private String subject;
    private List<String> mailBody;


    public Mail() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<String> getMailBody() {
        return mailBody;
    }

    public void setMailBody(List<String> mailBody) {
        this.mailBody = mailBody;
    }
}
