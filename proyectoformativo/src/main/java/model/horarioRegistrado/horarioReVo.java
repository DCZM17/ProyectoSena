package model.horarioRegistrado;

public class horarioReVo {
       
    private int idHorarioRegistrado;
    private String horaEntradaRegistrada;
    private String horaSalidaRegistrada;
    private String horaInicioAlmuerzo;
    private String horaFinAlmuerzo;
    private String fechaRegistro;
    private int estadoHorarioRegistrado;
    //private int idEmpleadoH;

    public horarioReVo(){

    }

    public horarioReVo(int idHorarioRegistrado, String horaEntradaRegistrada, String horaSalidaRegistrada, 
                                String horaInicioAlmuerzo, String horaFinAlmuerzo, String fechaRegistro,int estadoHorarioRegistrado){

        this.idHorarioRegistrado     = idHorarioRegistrado;
        this.horaEntradaRegistrada   = horaEntradaRegistrada;
        this.horaSalidaRegistrada    = horaSalidaRegistrada;
        this.horaInicioAlmuerzo      = horaInicioAlmuerzo;
        this.horaFinAlmuerzo         = horaFinAlmuerzo;
        this.fechaRegistro           = fechaRegistro;
        this.estadoHorarioRegistrado = estadoHorarioRegistrado;
        //this.idEmpleadoH             = idEmpleadoH;
             
    }

    // ID
    public int getIdHorarioRegistrado() {
        return idHorarioRegistrado;
    }

    public void setIdHorarioRegistrado(int idHorarioRegistrado) {
        this.idHorarioRegistrado = idHorarioRegistrado;
    }

    //HORA ENTRADA
    public String getHoraEntradaRegistrada() {
        return horaEntradaRegistrada;
    }

    public void setHoraEntradaRegistrada(String horaEntradaRegistrada) {
        this.horaEntradaRegistrada = horaEntradaRegistrada;
    }

    //HORA SALIDA
    public String getHoraSalidaRegistrada() {
        return horaSalidaRegistrada;
    }

    public void setHoraSalidaRegistrada(String horaSalidaRegistrada) {
        this.horaSalidaRegistrada = horaSalidaRegistrada;
    }

    //HORA SALIDA ALMUERZO
    public String getHoraInicioAlmuerzo() {
        return horaInicioAlmuerzo;
    }

    public void setHoraInicioAlmuerzo(String horaInicioAlmuerzo) {
        this.horaInicioAlmuerzo = horaInicioAlmuerzo;
    }


    //HORA ENTRADA ALMUERZO
    public String getHoraFinAlmuerzo() {
        return horaFinAlmuerzo;
    }

    public void setHoraFinAlmuerzo(String horaFinAlmuerzo) {
        this.horaFinAlmuerzo = horaFinAlmuerzo;
    }

    //FECHA DE REGISTRO
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    //ESTADO
    public int getEstadoHorarioRegistrado() {
        return estadoHorarioRegistrado;
    }

    public void setEstadoHorarioRegistrado(int estadoHorarioRegistrado) {
        this.estadoHorarioRegistrado = estadoHorarioRegistrado;
    }

    // ID EMPLEADO
   /*  public int getIdEmpleadoH() {
        return idEmpleadoH;
    }

    public void setIdEmpleadoH(int idEmpleadoH) {
        this.idEmpleadoH = idEmpleadoH;
    }
    */
}
