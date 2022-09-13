package model.empleado;

public class empleadoVo {

    //Datos tabla Usuario
    private int idUsuario;
    private String correoUsuario;
    private String contrasenaUsuario;
    private String rolUsuario;
    private Boolean estadoUsuario;

    //Datos tabla empleado
    private int idEmpleado;
    private String tipoDocEmpleado;
    private String docEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private String celularEmpleado;
    private String direccionEmpleado;
    private String correoEmpleado;
    private String fotoEmpleado;


    //Metodo Constructor vacio 
    public empleadoVo(){

    }
    //Metodo Constructor con parametros
    public empleadoVo(int idUsuario, String correoUsuario, String contrasenaUsuario, String rolUsuario, boolean estadoUsuario,
                      int idEmpleado, String tipoDocEmpleado, String docEmpleado, String nombreEmpleado, String apellidoEmpleado,
                      String celularEmpleado, String direccionEmpleado, String correoEmpleado, String fotoEmpleado){

                        this.idUsuario = idUsuario;
                        this.correoUsuario = correoUsuario;
                        this.contrasenaUsuario = contrasenaUsuario;
                        this.rolUsuario = rolUsuario;
                        this.estadoUsuario = estadoUsuario;
                        this.idEmpleado = idEmpleado;
                        this.tipoDocEmpleado = tipoDocEmpleado;
                        this.docEmpleado = docEmpleado;
                        this.nombreEmpleado = nombreEmpleado;
                        this.apellidoEmpleado = apellidoEmpleado;
                        this.celularEmpleado = celularEmpleado;
                        this.direccionEmpleado = direccionEmpleado;
                        this.correoEmpleado = correoEmpleado;
                        this.fotoEmpleado = fotoEmpleado;

    }
    //Getters and setters de la tabla usuario
 
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getCorreoUsuario() {
        return correoUsuario;
    }
    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }
    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }
    public String getRolUsuario() {
        return rolUsuario;
    }
    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }
    public Boolean getEstadoUsuario() {
        return estadoUsuario;
    }
    public void setEstadoUsuario(Boolean estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
    //Getters and setters de la tabla empleado
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public String getTipoDocEmpleado() {
        return tipoDocEmpleado;
    }
    public void setTipoDocEmpleado(String tipoDocEmpleado) {
        this.tipoDocEmpleado = tipoDocEmpleado;
    }
    public String getDocEmpleado() {
        return docEmpleado;
    }
    public void setDocEmpleado(String docEmpleado) {
        this.docEmpleado = docEmpleado;
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
    public String getCelularEmpleado() {
        return celularEmpleado;
    }
    public void setCelularEmpleado(String celularEmpleado) {
        this.celularEmpleado = celularEmpleado;
    }
    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }
    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }
    public String getCorreoEmpleado() {
        return correoEmpleado;
    }
    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }
    public String getFotoEmpleado() {
        return fotoEmpleado;
    }
    public void setFotoEmpleado(String fotoEmpleado) {
        this.fotoEmpleado = fotoEmpleado;
    }

}