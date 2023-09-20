public class SMTPAdapter implements MailAdapter{

    private SMTP smtp;

    public SMTPAdapter(SMTP smtp) {
        this.smtp = smtp;
    }

    @Override
    public String send(String mail) {
        return smtp.api("email" + mail);
    }
}
