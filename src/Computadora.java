public class Computadora {
    private String nombre;
    private long tiempo;

    public Computadora(String nombre, long tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public long obtenerTiempo() {
        return tiempo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void ajustarTiempo(long correccion) {
        this.tiempo += correccion;
    }

    @Override
    public String toString() {
        return "Computadora " + nombre + " [tiempo=" + tiempo + "]";
    }
}

