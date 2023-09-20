public class Main {
    public static void main(String[] args) throws InterruptedException {
        Client client = new Client("Angel");
        MailAdapter mailAdapter = new SendGridAdapter(new SendGrid());
        String email1 = mailAdapter.send("\n      -ESTO ES UN EMAIL-");

        client.enviarEmail(mailAdapter); //agregando una funcionalidad con el cliente

        System.out.println("------------------------------------");

        mailAdapter = new SMTPAdapter(new SMTP());
        String email2 = mailAdapter.send("\n      -ESTO ES OTRO EMAIL-");

        client.enviarEmail(mailAdapter);

        //sin ninguna funcionalidad aparte
        System.out.println("----------------------------------");
        System.out.println(email1);
        System.out.println("----------------------------------");
        System.out.println(email2);

    }
}
