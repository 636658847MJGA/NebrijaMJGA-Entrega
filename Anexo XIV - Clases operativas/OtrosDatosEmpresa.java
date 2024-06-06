package mjgaProjectoDAM1;

/**
 * @author Maria Jesus Gomez Arriba
 * These data are used just for the 
 * agreement with the Consultan company
 */

public class OtrosDatosEmpresa {
    
   private NIFempresa empresaNIF;
   private String empresaNombreComercial;
   private String empresaTelefono;
   private String empresaDireccionPostal;

/** CONSTRUCTOR */
public OtrosDatosEmpresa(NIFempresa empresaNIF, String empresaNombreComercial, String empresaTelefono,
        String empresaDireccionPostal) {
    this.empresaNIF = empresaNIF;
    this.empresaNombreComercial = empresaNombreComercial;
    this.empresaTelefono = empresaTelefono;
    this.empresaDireccionPostal = empresaDireccionPostal;
}

/** GETTERS and SETTERS */
public NIFempresa getEmpresaNIF() {
    return empresaNIF;
}

public void setEmpresaNIF(NIFempresa empresaNIF) {
    this.empresaNIF = empresaNIF;
}

public String getEmpresaNombreComercial() {
    return empresaNombreComercial;
}

public void setEmpresaNombreComercial(String empresaNombreComercial) {
    this.empresaNombreComercial = empresaNombreComercial;
}

public String getEmpresaTelefono() {
    return empresaTelefono;
}

public void setEmpresaTelefono(String empresaTelefono) {
    this.empresaTelefono = empresaTelefono;
}

public String getEmpresaDireccionPostal() {
    return empresaDireccionPostal;
}

public void setEmpresaDireccionPostal(String empresaDireccionPostal) {
    this.empresaDireccionPostal = empresaDireccionPostal;
}

/** TO STRING */
@Override
public String toString() {
    return "OtrosDatosEmpresa [empresaNIF=" + empresaNIF + ", empresaNombreComercial=" + empresaNombreComercial
            + ", empresaTelefono=" + empresaTelefono + ", empresaDireccionPostal=" + empresaDireccionPostal + "]";
}




   
}
