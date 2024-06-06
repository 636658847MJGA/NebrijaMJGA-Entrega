package mjgaProjectoDAM1;

public class RepresentanteResponsable extends Representante {
    
    private boolean rolResponsable;
    private String representanteTelefono;
    
    /** CONSTRUCTOR */
    public RepresentanteResponsable(NIFrepresentante representanteNIF, DatosAERepresentante representanteDatosAE,
            DatosRepresentacion representantDatosRepresentacion,
            DatosPersonalesRepresentante representanteDatosPersonalesRepresentante, boolean rolResponsable,
            String representanteTelefono) {
        super(representanteNIF, representanteDatosAE, representantDatosRepresentacion,
                representanteDatosPersonalesRepresentante);
        this.rolResponsable = rolResponsable;
        this.representanteTelefono = representanteTelefono;
    }

    /** GETTERS and SETTERS */
    public boolean isRolResponsable() {
        return rolResponsable;
    }

    public void setRolResponsable(boolean rolResponsable) {
        this.rolResponsable = rolResponsable;
    }

    public String getRepresentanteTelefono() {
        return representanteTelefono;
    }

    public void setRepresentanteTelefono(String representanteTelefono) {
        this.representanteTelefono = representanteTelefono;
    }

    /** TO STRING */
    @Override
    public String toString() {
        return "RepresentanteResponsable [rolResponsable=" + rolResponsable + ", representanteTelefono="
                + representanteTelefono + "]";
    }

    /** Specific method that allows the representative in charge
     * to designate another representatives
     */
    public void asignarRolRepresentante(){

    }

    /** Specific method that allows the representative in charge
     * to revoke any current representative
     */
    public void revocarRepresentante(){

    }
    
    /** Specific method that allows the representative in charge
     * to asign ACVITE status to a representantion uploaded in 
     * the App by the Consultant
     */
    public void confirmarAltaRepresentante(){

    }

    /** Specific method that allows the representative in charge
     * to request information from the Consultant
     */
    public void solicitarInformacion(){

    }
}
