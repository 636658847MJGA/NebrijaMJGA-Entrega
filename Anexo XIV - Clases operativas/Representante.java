package mjgaProjectoDAM1;

/** @author Maria Jesus Gomez Arriba
* This Class gather all the data 
* relative to the Representative
*/
public class Representante {

    protected NIFrepresentante representanteNIF;
    protected DatosAERepresentante representanteDatosAE;
    protected DatosRepresentacion representantDatosRepresentacion;
    protected DatosPersonalesRepresentante representanteDatosPersonalesRepresentante;
    
    /** CONSTRUCTOR */
    public Representante(NIFrepresentante representanteNIF, DatosAERepresentante representanteDatosAE,
            DatosRepresentacion representantDatosRepresentacion,
            DatosPersonalesRepresentante representanteDatosPersonalesRepresentante) {
        this.representanteNIF = representanteNIF;
        this.representanteDatosAE = representanteDatosAE;
        this.representantDatosRepresentacion = representantDatosRepresentacion;
        this.representanteDatosPersonalesRepresentante = representanteDatosPersonalesRepresentante;
    }

    /** GETTERS and SETTERS */
    public NIFrepresentante getRepresentanteNIF() {
        return representanteNIF;
    }

    public void setRepresentanteNIF(NIFrepresentante representanteNIF) {
        this.representanteNIF = representanteNIF;
    }

    public DatosAERepresentante getRepresentanteDatosAE() {
        return representanteDatosAE;
    }

    public void setRepresentanteDatosAE(DatosAERepresentante representanteDatosAE) {
        this.representanteDatosAE = representanteDatosAE;
    }

    public DatosRepresentacion getRepresentantDatosRepresentacion() {
        return representantDatosRepresentacion;
    }

    public void setRepresentantDatosRepresentacion(DatosRepresentacion representantDatosRepresentacion) {
        this.representantDatosRepresentacion = representantDatosRepresentacion;
    }

    public DatosPersonalesRepresentante getRepresentanteDatosPersonalesRepresentante() {
        return representanteDatosPersonalesRepresentante;
    }

    public void setRepresentanteDatosPersonalesRepresentante(
            DatosPersonalesRepresentante representanteDatosPersonalesRepresentante) {
        this.representanteDatosPersonalesRepresentante = representanteDatosPersonalesRepresentante;
    }

    /** TO STRING */
    @Override
    public String toString() {
        return "Representante [representanteNIF=" + representanteNIF + ", representanteDatosAE=" + representanteDatosAE
                + ", representantDatosRepresentacion=" + representantDatosRepresentacion
                + ", representanteDatosPersonalesRepresentante=" + representanteDatosPersonalesRepresentante + "]";
    }

    /** Specific method that allows the representative
     * to visualize the data provided by the Consultant
     */
    public void visualizarInformacion(){

    }

    /** With this method, the representatives
     *  privide information to the Consultant
     */
    public void facilitarInformacion(){
        
    }
}
