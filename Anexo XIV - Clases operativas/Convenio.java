package mjgaProjectoDAM1;

/**
 * @author Maria Jesus Gomez Arriba
 * These data define the agreement 
 * with the Consultan company
 */
public class Convenio {
      
    private NIFempresa empresaNIF;
    private String convenioCodigo;
    private String convenioFechaInicio;
    private String convenioFechaFin;
    private String convenioFechaRevocacion;
    private EstadosConvenio convenioEstado;
    
/** CONSTRUCTORS */    
public Convenio() {

}
public Convenio(NIFempresa empresaNIF, String convenioCodigo, String convenioFechaInicio, String convenioFechaFin,
            String convenioFechaRevocacion, EstadosConvenio convenioEstado) {
        this.empresaNIF = empresaNIF;
        this.convenioCodigo = convenioCodigo;
        this.convenioFechaInicio = convenioFechaInicio;
        this.convenioFechaFin = convenioFechaFin;
        this.convenioFechaRevocacion = convenioFechaRevocacion;
        this.convenioEstado = convenioEstado;
    }

/** GETTERS and SETTERS */
public NIFempresa getEmpresaNIF() {
    return empresaNIF;
}
public void setEmpresaNIF(NIFempresa empresaNIF) {
    this.empresaNIF = empresaNIF;
}
public String getConvenioCodigo() {
    return convenioCodigo;
}
public void setConvenioCodigo(String convenioCodigo) {
    this.convenioCodigo = convenioCodigo;
}
public String getConvenioFechaInicio() {
    return convenioFechaInicio;
}
public void setConvenioFechaInicio(String convenioFechaInicio) {
    this.convenioFechaInicio = convenioFechaInicio;
}
public String getConvenioFechaFin() {
    return convenioFechaFin;
}
public void setConvenioFechaFin(String convenioFechaFin) {
    this.convenioFechaFin = convenioFechaFin;
}
public String getConvenioFechaRevocacion() {
    return convenioFechaRevocacion;
}
public void setConvenioFechaRevocacion(String convenioFechaRevocacion) {
    this.convenioFechaRevocacion = convenioFechaRevocacion;
}
public EstadosConvenio getConvenioEstado() {
    return convenioEstado;
}
public void setConvenioEstado(EstadosConvenio convenioEstado) {
    this.convenioEstado = convenioEstado;
}

/** TO STRING */

@Override
    public String toString() {
        return "Convenio [empresaNIF=" + empresaNIF + ", convenioCodigo=" + convenioCodigo + ", convenioFechaInicio="
                + convenioFechaInicio + ", convenioFechaFin=" + convenioFechaFin + ", convenioFechaRevocacion="
                + convenioFechaRevocacion + ", convenioEstado=" + convenioEstado + "]";
    }
}
