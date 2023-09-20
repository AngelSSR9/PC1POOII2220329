public class Main {
    public static void main(String[] args) throws InterruptedException {
        Client client = new Client("Angel");
        MailAdapter mailAdapter = new SendGridAdapter(new SendGrid());
        String email1 = mailAdapter.send("      -ESTO ES UN EMAIL-");

        client.enviarEmail(mailAdapter);

        System.out.println("------------------------------------");

        mailAdapter = new SMTPAdapter(new SMTP());
        String email2 = mailAdapter.send("      -ESTO ES OTRO EMAIL-");

        client.enviarEmail(mailAdapter);

        
    }
}
