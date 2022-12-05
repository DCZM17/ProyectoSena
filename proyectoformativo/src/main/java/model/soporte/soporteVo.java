package model.soporte;

public class soporteVo {
    private int idSoporte;
    private String tipoSoporte;
    private String descripcionSoporte;
    private String fechaRegistro;
    private String fechaSoporte;
    private String soporte;
    private Boolean estadoSoporte;
    private int idEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;

    public soporteVo(){


    }
    public soporteVo(int idSoporte, String tipoSoporte,String descripcionSoporte, String fechaRegistro, String fechaSoporte,String soporte,
            Boolean estadoSoporte, int idEmpleado, String nombreEmpleado, String apellidoEmpleado) {
        this.idSoporte = idSoporte;
        this.tipoSoporte = tipoSoporte;
        this.descripcionSoporte = descripcionSoporte;
        this.fechaRegistro = fechaRegistro;
        this.fechaSoporte = fechaSoporte;
        this.soporte = soporte;
        this.estadoSoporte = estadoSoporte;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
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
    public Boolean getEstadoSoporte() {
        return estadoSoporte;
    }
    public void setEstadoSoporte(Boolean estadoSoporte) {
        this.estadoSoporte = estadoSoporte;
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
   public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    
    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }
    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }
}
