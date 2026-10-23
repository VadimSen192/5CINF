public class Drago implements Runnable {
    private String nome;
    int battiti;
    public Drago(int battiti, String nome) {
        this.battiti = battiti;
        this.nome = nome;
    }
    @Override
    public void run() {
            for(int i = 0; (i < battiti) && !Thread.interrupted(); i++) {
                System.out.print(nome + " sta facendo " + (i+1) + " battiti");
            }
    }
}
