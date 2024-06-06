package modelo;

import java.sql.SQLException;

import dao.DaoCE;

/**This class gather the initial 
 * login keys provided by the Consultant
 * to the companies */

public class ContraseniaEmpresa {
	
	private int id; //establecemos el campo que recogerá 
	//id que genera automáticamente la BDD
	private String empresaNIF;
	private String empresaContrasenia;
	private String logotipo;
	
	/** Empty constructor */
	public ContraseniaEmpresa() {
	}
	
	/** Constructor NO id*/
	public ContraseniaEmpresa(String empresaNIF, 
		   String empresaContrasenia, String logotipo) {
		this.empresaNIF = empresaNIF;
		this.empresaContrasenia = empresaContrasenia;
		this.logotipo = logotipo;
		}
	
	/** Constructor with id and NO logotipo*/
	public ContraseniaEmpresa(int id, String empresaNIF, 
		   String empresaContrasenia) {
		this.id = id;
		this.empresaNIF = empresaNIF;
		this.empresaContrasenia = empresaContrasenia;
		}
	
	/** Constructor NO id and NO logotipo*/
	public ContraseniaEmpresa(String empresaNIF, 
		   String empresaContrasenia) {
		this.empresaNIF = empresaNIF;
		this.empresaContrasenia = empresaContrasenia;
		}
	
	/** Complete constructor*/
	public ContraseniaEmpresa(int id, String empresaNIF, 
		   String empresaContrasenia, String logotipo) {
		this.id = id;
		this.empresaNIF = empresaNIF;
		this.empresaContrasenia = empresaContrasenia;
		this.logotipo = logotipo;
	}
	
	/** GETTERS and SETTERS */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpresaNIF() {
		return empresaNIF;
	}

	public void setEmpresaNIF(String empresaNIF) {
		this.empresaNIF = empresaNIF;
	}

	public String getEmpresaContrasenia() {
		return empresaContrasenia;
	}

	public void setEmpresaContrasenia(String empresaContrasenia) {
		this.empresaContrasenia = empresaContrasenia;
	}

	public String getLogotipo() {
		return logotipo;
	}

	public void setLogotipo(String logotipo) {
		this.logotipo = logotipo;
	}
	
	/** The insertar() method invoke the INSERT 
	 * method from DAO 
	 * @throws SQLException */
	public void insertar() throws SQLException {
		
		DaoCE dao = new DaoCE();
		dao.insertar(this);
	}
	
	/** Method toString()*/
	@Override
	public String toString() {
		return "ContraseniaEmpresa [id=" + id
				+ ", empresaNIF=" + empresaNIF 
				+ ", empresaContrasenia="
				+ empresaContrasenia + ", logotipo=" 
				+ logotipo + "]";
	}
	
}
