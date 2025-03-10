public class Manager {
    private String nume;
    private int nrProiecte;
    private double salariuBaza=80;

    public Manager(String nume, int nrProiecte) {
        this.nume = nume;
        this.nrProiecte = nrProiecte;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrProiecte() {
        return nrProiecte;
    }

    public void setNrProiecte(int nrProiecte) {
        this.nrProiecte = nrProiecte;
    }

    public double getSalariuBaza() {
        return salariuBaza;
    }

    public void setSalariuBaza(double salariuBaza) {
        this.salariuBaza = salariuBaza;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "nume='" + nume + '\'' +
                ", nrProiecte=" + nrProiecte +
                ", salariuBaza=" + salariuBaza +
                '}';
    }
}
