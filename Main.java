import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double salariuTotal =0.0;
        CalculatorSalariu calculatorSalariu=new CalculatorSalariu();
        Lucrator lucrator1=new Lucrator("Bogdan");
        Lucrator lucrator2=new Lucrator("Ionut");
        Manager manager=new Manager("Alex",5);

        List<CalculatorSalariuI> lista=new ArrayList<>();
        lista.add(lucrator1);
        lista.add(manager);
        Paznic paznic=new Paznic;
        lista.add(paznic);

        System.out.println("Hello world!");
    }
}