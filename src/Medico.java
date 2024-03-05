public class Medico {
    private String nombremedico;
    private String especialidad;
    public Medico(String nombremedico, String especialidad) {
        this.nombremedico = nombremedico;
        this.especialidad = especialidad;
    }
    public String getNombremedico() {
        return nombremedico;
    }

    public void setNombremedico(String nombremedico) {
        this.nombremedico = nombremedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}