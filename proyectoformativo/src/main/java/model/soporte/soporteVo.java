package model.soporte;

public class soporteVo {
    private int idSoporte;
    private String tipoSoporte;
    private String descripcionSoporte;
    private String fechaRegistro;
    private String fechaSoporte;
    private String soporte;
    private boolean estadoSoporte;

    public soporteVo(){


    }
    public soporteVo(int idSoporte, String tipoSoporte,String descripcionSoporte, String fechaRegistro, String fechaSoporte,String soporte,
            boolean estadoSoporte) {
        this.idSoporte = idSoporte;
        this.tipoSoporte = tipoSoporte;
        this.descripcionSoporte = descripcionSoporte;
        this.fechaRegistro = fechaRegistro;
        this.fechaSoporte = fechaSoporte;
        this.soporte = soporte;
        this.estadoSoporte = estadoSoporte;
    }
    public int getIdSoporte() {
        return idSoporte;
    }
    public void setIdSoporte(int idSoporte) {
        this.idSoporte = idSoporte;
    }
    public String getTipoSoporte() {
        return tipoSoporte;
    }
    public void setTipoSoporte(String tipoSoporte) {
        this.tipoSoporte = tipoSoporte;
    }
    public String getDescripcionSoporte() {
        return descripcionSoporte;
    }
    public void setDescripcionSoporte(String descripcionSoporte) {
        this.descripcionSoporte = descripcionSoporte;
    }
    public String getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public String getFechaSoporte() {
        return fechaSoporte;
    }
    public void setFechaSoporte(String fechaSoporte) {
        this.fechaSoporte = fechaSoporte;
    }
    public String getSoporte() {
        return soporte;
    }
    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
    public boolean isEstadoSoporte() {
        return estadoSoporte;
    }
    public void setEstadoSoporte(boolean estadoSoporte) {
        this.estadoSoporte = estadoSoporte;
    }
    
}
