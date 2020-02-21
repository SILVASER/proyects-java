package Modelo;

import java.util.Date;

/**
 *
 * @author Dani
 */
public class BandejaSalida {

    private int IdDetalle;
    private int CodigoRec;
    private String Procedimiento;
    private char IdRemitente;
    private char IdInstitucion;
    private String Remitente;
    private String Institucion;
    private String IdDependencia_Origen;
    private String IdDependencia_Destino;
    private char IdExpediente;
    private String Fechat;
    private String Origenc;
    private boolean Recepcionado;
    private char Periodo;
    private String IdProcedimiento;
    private String Personal;
    private Date FechaVencimientod;
    private String vencimiento;
    private Date Notificar;
    private String Asunto;
    private String Nombre;
    private String comentario;
    private String Adjuntos;
    private String Personald;
    private int Pasos;

    public BandejaSalida() {
    }

    public BandejaSalida(int IdDetalle, int CodigoRec, String Procedimiento, char IdRemitente, char IdInstitucion, String Remitente, String Institucion, String IdDependencia_Origen, String IdDependencia_Destino, char IdExpediente, String Fechat, String Origenc, boolean Recepcionado, char Periodo, String IdProcedimiento, String Personal, Date FechaVencimientod, String vencimiento, Date Notificar, String Asunto, String Nombre, String comentario, String Adjuntos, String Personald, int Pasos) {
        this.IdDetalle = IdDetalle;
        this.CodigoRec = CodigoRec;
        this.Procedimiento = Procedimiento;
        this.IdRemitente = IdRemitente;
        this.IdInstitucion = IdInstitucion;
        this.Remitente = Remitente;
        this.Institucion = Institucion;
        this.IdDependencia_Origen = IdDependencia_Origen;
        this.IdDependencia_Destino = IdDependencia_Destino;
        this.IdExpediente = IdExpediente;
        this.Fechat = Fechat;
        this.Origenc = Origenc;
        this.Recepcionado = Recepcionado;
        this.Periodo = Periodo;
        this.IdProcedimiento = IdProcedimiento;
        this.Personal = Personal;
        this.FechaVencimientod = FechaVencimientod;
        this.vencimiento = vencimiento;
        this.Notificar = Notificar;
        this.Asunto = Asunto;
        this.Nombre = Nombre;
        this.comentario = comentario;
        this.Adjuntos = Adjuntos;
        this.Personald = Personald;
        this.Pasos = Pasos;
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

    public String getRemitente() {
        return Remitente;
    }

    public void setRemitente(String Remitente) {
        this.Remitente = Remitente;
    }

    public String getInstitucion() {
        return Institucion;
    }

    public void setInstitucion(String Institucion) {
        this.Institucion = Institucion;
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

    public String getPersonal() {
        return Personal;
    }

    public void setPersonal(String Personal) {
        this.Personal = Personal;
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

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getAdjuntos() {
        return Adjuntos;
    }

    public void setAdjuntos(String Adjuntos) {
        this.Adjuntos = Adjuntos;
    }

    public String getPersonald() {
        return Personald;
    }

    public void setPersonald(String Personald) {
        this.Personald = Personald;
    }

    public int getPasos() {
        return Pasos;
    }

    public void setPasos(int Pasos) {
        this.Pasos = Pasos;
    }

}
