public class SendGridAdapter implements MailAdapter{

    private SendGrid sendGrid;

    public SendGridAdapter(SendGrid sendGrid) {
        this.sendGrid = sendGrid;
    }

    @Override
    public String send(String mail) {
        return sendGrid.api("email" + mail);
    }
}
