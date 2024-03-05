public class Cama {
    private int numerodecama;
    private boolean estadocama=false;
    Planta planta1;

    public Cama(int numerodecama, Planta planta1) {
        this.numerodecama = numerodecama;
        this.planta1 = planta1;
        this.estadocama = false;
    }
    public Cama(boolean camaocupada) {
        this.estadocama = camaocupada;
    }
    public void ocuparcama(){
        estadocama =true;
    }
    public void liberarcama(){
        estadocama =false;
    }
    public boolean isEstadocama() {
        return estadocama;
    }

    public int getNumerodecama() {
        return numerodecama;
    }

    public void setNumerodecama(int numerodecama) {
        this.numerodecama = numerodecama;
    }

    public void setEstadocama(boolean estadocama) {
        this.estadocama = estadocama;
    }

    public Planta getPlanta1() {
        return planta1;
    }

    public void setPlanta1(Planta planta1) {
        this.planta1 = planta1;
    }
}