package Modelo;

/**
 *
 * @author Dani
 */
public class Periodos {
    
    private char periodo;
    private boolean estado;

    public Periodos(char periodo, boolean estado) {
        this.periodo = periodo;
        this.estado = estado;
    }

    public char getPeriodo() {
        return periodo;
    }

    public void setPeriodo(char periodo) {
        this.periodo = periodo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
