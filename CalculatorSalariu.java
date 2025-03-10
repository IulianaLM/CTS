public class CalculatorSalariu {
    public double calculatorSalariuLucrator(Lucrator lucrator){
        return lucrator.getTarifOra()*lucrator.getNrOreLucrate();
    }

    public double calculSalariuManager(Manager manager){
        return manager.getSalariuBaza() + manager.getNrProiecte() * 1000;
    }
}
