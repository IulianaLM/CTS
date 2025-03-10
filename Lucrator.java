public class Lucrator {
    private String nume;
    private double tarifOra=10;
    private int nrOreLucrate=8;

    public Lucrator(String nume) {
        this.nume = nume;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getTarifOra() {
        return tarifOra;
    }

    public void setTarifOra(double tarifOra) {
        this.tarifOra = tarifOra;
    }

    public int getNrOreLucrate() {
        return nrOreLucrate;
    }

    public void setNrOreLucrate(int nrOreLucrate) {
        this.nrOreLucrate = nrOreLucrate;
    }

    @Override
    public String toString() {
        return "Lucrator{" +
                "nume='" + nume + '\'' +
                ", tarifOra=" + tarifOra +
                ", nrOreLucrate=" + nrOreLucrate +
                '}';
    }

    @Override
    public double calculSalariu(){
        return this.getTarifOra()*this.getNrOreLucrate();
    }
}
