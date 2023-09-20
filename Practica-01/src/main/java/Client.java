public class Client {
    private String nombre;

    public Client(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void enviarEmail(MailAdapter email) throws InterruptedException {
        System.out.println("Enviando al cliente " + nombre + " " + email.send(" {NUEVO EMAIL}"));
        System.out.println("Cargando...");
        Thread.sleep(3500);
        System.out.println("Email entregado correctamente");
    }

}
