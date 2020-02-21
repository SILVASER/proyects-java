package Modelo;

import java.util.Date;

/**
 *
 * @author Dani
 */
public class BandejaEntrada {
    
    private int IdDetalle;
    private int CodigoRec;
    private String IdDependencia_Origen;
    private String IdDependencia_Destino;
    private char IdExpediente;
    private String Fechat; /*..............5 mostrar en la tabla*/
    private String Origenc; /*...........1 mostrar en la tabla*/
    private boolean Recepcionado;
    private char Periodo;
    private String IdProcedimiento;
    private String Personal; /*..........2 mostrar en la tabla*/
    private String Personald;
    private Date FechaVencimientod;
    private String vencimiento; /*.........6 mostrar en la tabla*/
    private Date Notificar;
    private String Asunto; /*.............3 mostrar en la tabla*/
    //private String IdDependencia_Destino;
    private String Comentario; /*.........4 mostrar en la tabla*/
    private int Adjuntos;
    private int Pasos;
    private String Institucion;
    private String Remitente;
    private String Procedimiento;
    private int folios;
    private char IdRemitente;
    private char IdInstitucion;

    public BandejaEntrada() {
    }

    public BandejaEntrada(int IdDetalle, int CodigoRec, String IdDependencia_Origen, String IdDependencia_Destino,
            char IdExpediente, String Fechat, String Origenc, boolean Recepcionado, char Periodo, String IdProcedimiento,
            String Personal, String Personald, Date FechaVencimientod, String vencimiento, Date Notificar, String Asunto, String Comentario, int Adjuntos, int Pasos, String Institucion, String Remitente, String Procedimiento, int folios, char IdRemitente, char IdInstitucion) {
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
        this.Personal = Personal;
        this.Personald = Personald;
        this.FechaVencimientod = FechaVencimientod;
        this.vencimiento = vencimiento;
        this.Notificar = Notificar;
        this.Asunto = Asunto;
        this.Comentario = Comentario;
        this.Adjuntos = Adjuntos;
        this.Pasos = Pasos;
        this.Institucion = Institucion;
        this.Remitente = Remitente;
        this.Procedimiento = Procedimiento;
        this.folios = folios;
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

    public String getPersonal() {
        return Personal;
    }

    public void setPersonal(String Personal) {
        this.Personal = Personal;
    }

    public String getPersonald() {
        return Personald;
    }

    public void setPersonald(String Personald) {
        this.Personald = Personald;
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

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
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

    public int getFolios() {
        return folios;
    }

    public void setFolios(int folios) {
        this.folios = folios;
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
