import java.util.List;

public class AlgoritmoBerkeley {
    private List<Computadora> computadoras;
    private Computadora lider;

    public AlgoritmoBerkeley(List<Computadora> computadoras, Computadora lider) {
        this.computadoras = computadoras;
        this.lider = lider;
    }

    public void sincronizarRelojes() {
        long tiempoLider = lider.obtenerTiempo();
        long diferenciaTotal = 0;
        int cantidad = computadoras.size();

        for (Computadora computadora : computadoras) {
            long diferencia = computadora.obtenerTiempo() - tiempoLider;
            diferenciaTotal += diferencia;
            System.out.println(computadora.obtenerNombre() + " tiempo: " + computadora.obtenerTiempo() + " (diferencia: " + diferencia + ")");
        }

        long correccionPromedio = diferenciaTotal / cantidad;

        for (Computadora computadora : computadoras) {
            long correccion = -correccionPromedio;
            computadora.ajustarTiempo(correccion);
            System.out.println("Ajustado " + computadora.obtenerNombre() + " por " + correccion + " a " + computadora.obtenerTiempo());
        }

        lider.ajustarTiempo(-correccionPromedio);
        System.out.println("Ajustado el líder " + lider.obtenerNombre() + " por " + (-correccionPromedio) + " a " + lider.obtenerTiempo());
    }
}
