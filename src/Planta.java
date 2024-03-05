public class Planta {
    private int numeroplanta;
    private String descripcion;

    public Planta(int numeroplanta, String descripcion) {
        this.numeroplanta = numeroplanta;
        this.descripcion = descripcion;
    }

    public int getNumeroplanta() {
        return numeroplanta;
    }

    public void setNumeroplanta(int numeroplanta) {
        this.numeroplanta = numeroplanta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}