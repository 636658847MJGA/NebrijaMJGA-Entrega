package mjgaProjectoDAM1;

/**
 * @author Maria Jesus Gomez Arriba
 * These are the data of the Representatives
 * related to their representation of the Company
 */
public class DatosRepresentacion {

    private NIFrepresentante representanteNIF;
    private NIFempresa empresaNIF;
    private boolean rolRepresentante;
    private EstadosRepresentacion representanteEstado;
    private String representanteFechaInicio;
    private String representanteFechaFin;
    private String representanteFechaRevocacion;
    
    /** CONSTRUCTORS */
    public DatosRepresentacion() {
    }
    
    public DatosRepresentacion(NIFrepresentante representanteNIF, NIFempresa empresaNIF, boolean rolRepresentante,
            EstadosRepresentacion representanteEstado, String representanteFechaInicio, String representanteFechaFin,
            String representanteFechaRevocacion) {
        this.representanteNIF = representanteNIF;
        this.empresaNIF = empresaNIF;
        this.rolRepresentante = rolRepresentante;
        this.representanteEstado = representanteEstado;
        this.representanteFechaInicio = representanteFechaInicio;
        this.representanteFechaFin = representanteFechaFin;
        this.representanteFechaRevocacion = representanteFechaRevocacion;
    }

    /** GETTERS and SETTERS */
    public NIFrepresentante getRepresentanteNIF() {
        return representanteNIF;
    }

    public void setRepresentanteNIF(NIFrepresentante representanteNIF) {
        this.representanteNIF = representanteNIF;
    }

    public NIFempresa getEmpresaNIF() {
        return empresaNIF;
    }

    public void setEmpresaNIF(NIFempresa empresaNIF) {
        this.empresaNIF = empresaNIF;
    }

    public boolean isRolRepresentante() {
        return rolRepresentante;
    }

    public void setRolRepresentante(boolean rolRepresentante) {
        this.rolRepresentante = rolRepresentante;
    }

    public EstadosRepresentacion getRepresentanteEstado() {
        return representanteEstado;
    }

    public void setRepresentanteEstado(EstadosRepresentacion representanteEstado) {
        this.representanteEstado = representanteEstado;
    }

    public String getRepresentanteFechaInicio() {
        return representanteFechaInicio;
    }

    public void setRepresentanteFechaInicio(String representanteFechaInicio) {
        this.representanteFechaInicio = representanteFechaInicio;
    }

    public String getRepresentanteFechaFin() {
        return representanteFechaFin;
    }

    public void setRepresentanteFechaFin(String representanteFechaFin) {
        this.representanteFechaFin = representanteFechaFin;
    }

    public String getRepresentanteFechaRevocacion() {
        return representanteFechaRevocacion;
    }

    public void setRepresentanteFechaRevocacion(String representanteFechaRevocacion) {
        this.representanteFechaRevocacion = representanteFechaRevocacion;
    }

    /** TO STRING */
    @Override
    public String toString() {
        return "DatosRepresentacion [representanteNIF=" + representanteNIF + ", empresaNIF=" + empresaNIF
                + ", rolRepresentante=" + rolRepresentante + ", representanteEstado=" + representanteEstado
                + ", representanteFechaInicio=" + representanteFechaInicio + ", representanteFechaFin="
                + representanteFechaFin + ", representanteFechaRevocacion=" + representanteFechaRevocacion + "]";
    }

    

}
