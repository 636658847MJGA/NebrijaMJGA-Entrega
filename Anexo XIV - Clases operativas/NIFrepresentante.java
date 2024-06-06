package mjgaProjectoDAM1;

/**
 * @author Maria Jesus Gomez Arriba
 * This class show the PersonalID of the representative
 * It's used to identify the company as is a unique value 
 * whitin the whole country
 */
public class NIFrepresentante {
    
    public String representanteNIF;

    /** CONSTRUCTOR */
    public NIFrepresentante(String representanteNIF) {
        this.representanteNIF = representanteNIF;
    }

    /** GETTERS and SETTERS */
    public String getRepresentanteNIF() {
        return representanteNIF;
    }

    public void setRepresentanteNIF(String representanteNIF) {
        this.representanteNIF = representanteNIF;
    }

    /** TO STRING */
    @Override
    public String toString() {
        return "NIFrepresentante [representanteNIF=" + representanteNIF + "]";
    }
}
