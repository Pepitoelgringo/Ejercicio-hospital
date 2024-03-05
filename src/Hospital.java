public class Hospital {
    private String nombrehospital;
    private String direccionhospital;
    public Hospital(String nombrehospital, String direccionhospital) {
        this.nombrehospital = nombrehospital;
        this.direccionhospital = direccionhospital;
    }

    public String getNombrehospital() {
        return nombrehospital;
    }

    public void setNombrehospital(String nombrehospital) {
        this.nombrehospital = nombrehospital;
    }

    public String getDireccionhospital() {
        return direccionhospital;
    }

    public void setDireccionhospital(String direccionhospital) {
        this.direccionhospital = direccionhospital;
    }
}
