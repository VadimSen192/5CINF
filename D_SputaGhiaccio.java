public class D_SputaGhiaccio extends Drago implements Runnable {
    private Principessa principessaDaCatturare;

    public D_SputaGhiaccio(String nome, Principessa principessaDaCatturare) {
        super(nome);
        this.principessaDaCatturare = principessaDaCatturare;
    }

    @Override
    public String Distruggi() {
        return this.getNome() + " sta congelando il villaggio";
    }

    @Override
    public void run() {
        for (int i = 0; (i < 5) && !Thread.interrupted(); i++) {
            System.out.println(this.getNome() + " sputa ghiaccio e si libra nell'aria: " + (i + 1) + " battiti");
            
            double randomValue = Math.random();
            if (randomValue > 0.5 && principessaDaCatturare != null && principessaDaCatturare.isLibera()) {
                principessaDaCatturare.setCatturata();
                System.out.println(">>> " + this.getNome() + " ha catturato la principessa " + principessaDaCatturare.getNome() + "!");
            }
            
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
