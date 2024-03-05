public class Enfermo {
    private String nombrepaciente;
    private int numeross;
    private Cama camaasignada;
    private Medico medicoasignado;
    public void asignarcama(Cama cama) {
        if (this.nombrepaciente!=null) {
            if (!cama.isEstadocama()) {
                camaasignada = cama;
                cama.ocuparcama();
                System.out.println("Cama asignada correctamente");
            } else {
                System.out.println("Esa cama ya esta asignada a otro paciente");
            }
        } else {
            System.out.println("No se puede asignar la cama, no hay paciente");
        }
    }
    public void desasignarcama() {
        if (this.nombrepaciente!=null) {
            if (camaasignada != null) {
                camaasignada.liberarcama();
                camaasignada = null;
                nombrepaciente = null;
                System.out.println("Cama desasignada correctamente");
            } else {
                System.out.println("No hay ninguna cama asignada");
            }
        } else {
            System.out.println("No se puede desasignar la cama, no hay paciente");
        }
    }
    public void asignarmedico(Medico medico) {
            if (this.nombrepaciente == null) {
                System.out.println("No se puede asignar el medico, no hay paciente");
            } if (medicoasignado==null){
                System.out.println("Médico asignado correctamente");
                medicoasignado = medico;
            }
    }
    public void desasignarmedico() {
            if (this.nombrepaciente == null) {
                System.out.println("No se puede desasignar el medico, no hay paciente");
            } else {
                if (medicoasignado != null) {
                    medicoasignado = null;
                    System.out.println("Médico desasignado correctamente");
                } else {
                    System.out.println("No hay medico para desasignar");
                }
            }
    }
    public Enfermo() {
    }

    public String getNombrepaciente() {
        return nombrepaciente;
    }

    public void setNombrepaciente(String nombrepaciente) {
        this.nombrepaciente = nombrepaciente;
    }

    public int getNumeross() {
        return numeross;
    }

    public void setNumeross(int numeross) {
        this.numeross = numeross;
    }

    public Cama getCamaasignada() {
        return camaasignada;
    }

    public void setCamaasignada(Cama camaasignada) {
        this.camaasignada = camaasignada;
    }

    public Medico getMedicoasignado() {
        return medicoasignado;
    }

    public void setMedicoasignado(Medico medicoasignado) {
        this.medicoasignado = medicoasignado;
    }
}