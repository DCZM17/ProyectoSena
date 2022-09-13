package model.horarioAsignado;

public class asigHorarioVo {
    private int idHorarioAsignado;
    private String horaEntradaAsignada;
    private String horaSalidaAsignada;
    private boolean estadoHorario;

    public asigHorarioVo(){

    }

    public asigHorarioVo(int idHorarioAsignado, String horaEntradaAsignada, String horaSalidaAsignada, boolean estadoHorario) {
        this.idHorarioAsignado=idHorarioAsignado;
        this.horaEntradaAsignada=horaEntradaAsignada;
        this.horaSalidaAsignada=horaSalidaAsignada;
        this.estadoHorario=estadoHorario;
    }

    public int getIdHorarioAsignado() {
        return idHorarioAsignado;
    }

    public void setIdHorarioAsignado(int idHorarioAsignado) {
        this.idHorarioAsignado = idHorarioAsignado;
    }

    public String getHoraEntradaAsignada() {
        return horaEntradaAsignada;
    }

    public void setHoraEntradaAsignada(String horaEntradaAsignada) {
        this.horaEntradaAsignada = horaEntradaAsignada;
    }

    public String getHoraSalidaAsignada() {
        return horaSalidaAsignada;
    }

    public void setHoraSalidaAsignada(String horaSalidaAsignada) {
        this.horaSalidaAsignada = horaSalidaAsignada;
    }

    public boolean isEstadoHorario() {
        return estadoHorario;
    }

    public void setEstadoHorario(boolean estadoHorario) {
        this.estadoHorario = estadoHorario;
    }
    
}
