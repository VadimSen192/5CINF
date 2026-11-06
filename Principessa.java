public class Principessa {
    private String nome;
    private Drago carceriere;
    private String stato;
    public Principessa(String nome) {
        this.nome = nome;
        this.stato = "libera";
    }
    public Drago getCarceriere() {
        return carceriere;
    }
    public void setCarceriere(Drago carceriere) {
        this.carceriere = carceriere;
    }
    public String getStato() {
        return stato;
    }
    public void setStato() {
        this.stato = stato;
    }
}
