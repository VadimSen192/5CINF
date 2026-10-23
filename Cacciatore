public class Cacciatore {
    private String nome;
    private Thread drago;

    public Cacciatore(String nome) {
        this.nome = nome;
    }

    public void lanciaDardi(Thread d) {
        for (int i = 0; i <= 50; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("sleep error nel main" + e);
            }
            System.out.println("il cacciatore " + nome + " sta lanciando il dardo = " + i);
            d.interrupt();
        }
    }
}
