package Modelo;

import java.util.Date;

/**
 *
 * @author Dani
 */
public class BandejaArchivos {

    private int IdDetalle;
    private int CodigoRec;
    private String IdDependencia_Origen;
    private String IdDependencia_Destino;
    private char IdExpediente;
    private String Fechat;
    private String Origenc;
    private boolean Recepcionado;
    private char Periodo;
    private String IdProcedimiento;
    private Date FechaVencimientod;
    private String vencimiento;
    private Date Notificar;
    private String Asunto;
    private String Personal;
    private String Comentario;
    private String Personald;
    private int Adjuntos;
    private int Pasos;
    private String Institucion;
    private String Remitente;
    private String Procedimiento;
    private char IdRemitente;
    private char IdInstitucion;

    public BandejaArchivos() {
    }

    public BandejaArchivos(int IdDetalle, int CodigoRec, String IdDependencia_Origen, String IdDependencia_Destino, char IdExpediente, String Fechat, String Origenc, boolean Recepcionado, char Periodo, String IdProcedimiento, Date FechaVencimientod, String vencimiento, Date Notificar, String Asunto, String Personal, String Comentario, String Personald, int Adjuntos, int Pasos, String Institucion, String Remitente, String Procedimiento, char IdRemitente, char IdInstitucion) {
        this.IdDetalle = IdDetalle;
        this.CodigoRec = CodigoRec;
        this.IdDependencia_Origen = IdDependencia_Origen;
        this.IdDependencia_Destino = IdDependencia_Destino;
        this.IdExpediente = IdExpediente;
        this.Fechat = Fechat;
        this.Origenc = Origenc;
        this.Recepcionado = Recepcionado;
        this.Periodo = Periodo;
        this.IdProcedimiento = IdProcedimiento;
        this.FechaVencimientod = FechaVencimientod;
        this.vencimiento = vencimiento;
        this.Notificar = Notificar;
        this.Asunto = Asunto;
        this.Personal = Personal;
        this.Comentario = Comentario;
        this.Personald = Personald;
        this.Adjuntos = Adjuntos;
        this.Pasos = Pasos;
        this.Institucion = Institucion;
        this.Remitente = Remitente;
        this.Procedimiento = Procedimiento;
        this.IdRemitente = IdRemitente;
        this.IdInstitucion = IdInstitucion;
    }

    public int getIdDetalle() {
        return IdDetalle;
    }

    public void setIdDetalle(int IdDetalle) {
        this.IdDetalle = IdDetalle;
    }

    public int getCodigoRec() {
        return CodigoRec;
    }

    public void setCodigoRec(int CodigoRec) {
        this.CodigoRec = CodigoRec;
    }

    public String getIdDependencia_Origen() {
        return IdDependencia_Origen;
    }

    public void setIdDependencia_Origen(String IdDependencia_Origen) {
        this.IdDependencia_Origen = IdDependencia_Origen;
    }

    public String getIdDependencia_Destino() {
        return IdDependencia_Destino;
    }

    public void setIdDependencia_Destino(String IdDependencia_Destino) {
        this.IdDependencia_Destino = IdDependencia_Destino;
    }

    public char getIdExpediente() {
        return IdExpediente;
    }

    public void setIdExpediente(char IdExpediente) {
        this.IdExpediente = IdExpediente;
    }

    public String getFechat() {
        return Fechat;
    }

    public void setFechat(String Fechat) {
        this.Fechat = Fechat;
    }

    public String getOrigenc() {
        return Origenc;
    }

    public void setOrigenc(String Origenc) {
        this.Origenc = Origenc;
    }

    public boolean isRecepcionado() {
        return Recepcionado;
    }

    public void setRecepcionado(boolean Recepcionado) {
        this.Recepcionado = Recepcionado;
    }

    public char getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(char Periodo) {
        this.Periodo = Periodo;
    }

    public String getIdProcedimiento() {
        return IdProcedimiento;
    }

    public void setIdProcedimiento(String IdProcedimiento) {
        this.IdProcedimiento = IdProcedimiento;
    }

    public Date getFechaVencimientod() {
        return FechaVencimientod;
    }

    public void setFechaVencimientod(Date FechaVencimientod) {
        this.FechaVencimientod = FechaVencimientod;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Date getNotificar() {
        return Notificar;
    }

    public void setNotificar(Date Notificar) {
        this.Notificar = Notificar;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getPersonal() {
        return Personal;
    }

    public void setPersonal(String Personal) {
        this.Personal = Personal;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public String getPersonald() {
        return Personald;
    }

    public void setPersonald(String Personald) {
        this.Personald = Personald;
    }

    public int getAdjuntos() {
        return Adjuntos;
    }

    public void setAdjuntos(int Adjuntos) {
        this.Adjuntos = Adjuntos;
    }

    public int getPasos() {
        return Pasos;
    }

    public void setPasos(int Pasos) {
        this.Pasos = Pasos;
    }

    public String getInstitucion() {
        return Institucion;
    }

    public void setInstitucion(String Institucion) {
        this.Institucion = Institucion;
    }

    public String getRemitente() {
        return Remitente;
    }

    public void setRemitente(String Remitente) {
        this.Remitente = Remitente;
    }

    public String getProcedimiento() {
        return Procedimiento;
    }

    public void setProcedimiento(String Procedimiento) {
        this.Procedimiento = Procedimiento;
    }

    public char getIdRemitente() {
        return IdRemitente;
    }

    public void setIdRemitente(char IdRemitente) {
        this.IdRemitente = IdRemitente;
    }

    public char getIdInstitucion() {
        return IdInstitucion;
    }

    public void setIdInstitucion(char IdInstitucion) {
        this.IdInstitucion = IdInstitucion;
    }

}
