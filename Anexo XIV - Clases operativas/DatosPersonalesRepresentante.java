package mjgaProjectoDAM1;

/**
 * @author Maria Jesus Gomez Arriba
 * These are the personal data 
 * of the Company's Representative 
 * that are used just for the 
 * agreement with the Consultan company
 */
public class DatosPersonalesRepresentante {
    
    private NIFrepresentante representanteNIF;
    private String representanteNombre;
    private String representanteApellidos;
    
    
    
    /** CONSTRUCTOR */
    public DatosPersonalesRepresentante(NIFrepresentante representanteNIF, String representanteNombre,
            String representanteApellidos) {
        this.representanteNIF = representanteNIF;
        this.representanteNombre = representanteNombre;
        this.representanteApellidos = representanteApellidos;
    }

    /** GETTERS and SETTERS */
    public NIFrepresentante getRepresentanteNIF() {
        return representanteNIF;
    }

    public void setRepresentanteNIF(NIFrepresentante representanteNIF) {
        this.representanteNIF = representanteNIF;
    }

    public String getRepresentanteNombre() {
        return representanteNombre;
    }

    public void setRepresentanteNombre(String representanteNombre) {
        this.representanteNombre = representanteNombre;
    }

    public String getRepresentanteApellidos() {
        return representanteApellidos;
    }

    public void setRepresentanteApellidos(String representanteApellidos) {
        this.representanteApellidos = representanteApellidos;
    }

    /** TO STRING */
    @Override
    public String toString() {
        return "DatosPersonalesRepresentante [representanteNIF=" + representanteNIF + ", representanteNombre="
                + representanteNombre + ", representanteApellidos=" + representanteApellidos + "]";
    }


}
  