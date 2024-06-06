package mjgaProjectoDAM1;

/**
 * @author Maria Jesus Gomez Arriba
 * This class show the TaxID of the company
 * It's used to identify the company as is a unique value 
 * whitin the whole country
 */
public class NIFempresa{
    
    /** This is the atribute that the other classes 
     * use to bind with the company 
      */
    public String empresaNIF;

    /** CONSTRUCTOR */
    public NIFempresa(String empresaNIF) {
        this.empresaNIF = empresaNIF;
    }

    /** GETTER */
    public String getEmpresaNIF() {
        return empresaNIF;
    }

    /** SETTER */
    public void setEmpresaNIF(String empresaNIF) {
        this.empresaNIF = empresaNIF;
    }

    @Override
    public String toString() {
        return "NIFempresa [empresaNIF=" + empresaNIF + "]";
    }

    

}


