package mjgaProjectoDAM1;


/**
 * @author Maria Jesus Gomez Arriba
 * Here we have the data of the company 
 * required for the Electronic Office
 */
public class DatosAEmpresa {

   private NIFempresa empresaNIF;
   private String empresaNombreFiscal;
   private String empresaCodigo;
   private String empresaEmailCorporativo;
   private TipoDeEmpresa empresaTipo;
   private String empresaLogo;

/**CONSTRUCTORS */
public DatosAEmpresa() {
}

public DatosAEmpresa(NIFempresa empresaNIF, String empresaNombreFiscal, String empresaCodigo,
        String empresaEmailCorporativo, TipoDeEmpresa empresaTipo, String empresaLogo) {
    this.empresaNIF = empresaNIF;
    this.empresaNombreFiscal = empresaNombreFiscal;
    this.empresaCodigo = empresaCodigo;
    this.empresaEmailCorporativo = empresaEmailCorporativo;
    this.empresaTipo = empresaTipo;
    this.empresaLogo = empresaLogo;
}

/** GETTERS and SETTERS */
public NIFempresa getEmpresaNIF() {
    return empresaNIF;
}

public void setEmpresaNIF(NIFempresa empresaNIF) {
    this.empresaNIF = empresaNIF;
}

public String getEmpresaNombreFiscal() {
    return empresaNombreFiscal;
}

public void setEmpresaNombreFiscal(String empresaNombreFiscal) {
    this.empresaNombreFiscal = empresaNombreFiscal;
}

public String getEmpresaCodigo() {
    return empresaCodigo;
}

public void setEmpresaCodigo(String empresaCodigo) {
    this.empresaCodigo = empresaCodigo;
}

public String getEmpresaEmailCorporativo() {
    return empresaEmailCorporativo;
}

public void setEmpresaEmailCorporativo(String empresaEmailCorporativo) {
    this.empresaEmailCorporativo = empresaEmailCorporativo;
}

public TipoDeEmpresa getEmpresaTipo() {
    return empresaTipo;
}

public void setEmpresaTipo(TipoDeEmpresa empresaTipo) {
    this.empresaTipo = empresaTipo;
}

public String getEmpresaLogo() {
    return empresaLogo;
}

public void setEmpresaLogo(String empresaLogo) {
    this.empresaLogo = empresaLogo;
}

/** TO STRING */
@Override
public String toString() {
    return "DatosAEmpresa [empresaNIF=" + empresaNIF + ", empresaNombreFiscal=" + empresaNombreFiscal
            + ", empresaCodigo=" + empresaCodigo + ", empresaEmailCorporativo=" + empresaEmailCorporativo
            + ", empresaTipo=" + empresaTipo + ", empresaLogo=" + empresaLogo + "]";
}





}
