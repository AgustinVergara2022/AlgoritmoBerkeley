import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Computadora computadora1 = new Computadora("PC1", System.currentTimeMillis() + 5000); // Adelantada en 5 segundos
        Computadora computadora2 = new Computadora("PC2", System.currentTimeMillis() - 3000); // Atrasada en 3 segundos
        Computadora computadora3 = new Computadora("PC3", System.currentTimeMillis() + 10000); // Adelantada en 10 segundos

        Computadora lider = computadora1;

        List<Computadora> computadoras = new ArrayList<>();
        computadoras.add(computadora2);
        computadoras.add(computadora3);

        AlgoritmoBerkeley algoritmoBerkeley = new AlgoritmoBerkeley(computadoras, lider);
        algoritmoBerkeley.sincronizarRelojes();
    }
}
