package mjgaProjectoDAM1;

/** @author Maria Jesus Gomez Arriba
* Here we have the data of Company's Representative
* required for the Electronic Office
*/
public class DatosAERepresentante {

    private NIFrepresentante representanteNIF;
    private String representaneIniciales; 
    private String representanteEmailCorporativo;
    
    /** CONSTRUCTOR */
    public DatosAERepresentante(NIFrepresentante representanteNIF, String representaneIniciales,
            String representanteEmailCorporativo) {
        this.representanteNIF = representanteNIF;
        this.representaneIniciales = representaneIniciales;
        this.representanteEmailCorporativo = representanteEmailCorporativo;
    }

    /** GETTERS and SETTERS */
    public NIFrepresentante getRepresentanteNIF() {
        return representanteNIF;
    }

    public void setRepresentanteNIF(NIFrepresentante representanteNIF) {
        this.representanteNIF = representanteNIF;
    }

    public String getRepresentaneIniciales() {
        return representaneIniciales;
    }

    public void setRepresentaneIniciales(String representaneIniciales) {
        this.representaneIniciales = representaneIniciales;
    }

    public String getRepresentanteEmailCorporativo() {
        return representanteEmailCorporativo;
    }

    public void setRepresentanteEmailCorporativo(String representanteEmailCorporativo) {
        this.representanteEmailCorporativo = representanteEmailCorporativo;
    }

    /** TO STRING */
    @Override
    public String toString() {
        return "DatosAERepresentante [representanteNIF=" + representanteNIF + ", representaneIniciales="
                + representaneIniciales + ", representanteEmailCorporativo=" + representanteEmailCorporativo + "]";
    }
    
}