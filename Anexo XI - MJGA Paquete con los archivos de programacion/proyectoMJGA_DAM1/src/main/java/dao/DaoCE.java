package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.ContraseniaEmpresa;

public class DaoCE {
	
	private Connection con = null;
	
	public DaoCE() throws SQLException{
		con = DBConection.getConexion();
	}

	public void insertar (ContraseniaEmpresa a) throws SQLException {
		 
		PreparedStatement ps = con.prepareStatement
			("INSERT tabla_mjga_ce (empresaNIF,empresaContrasenia) VALUES (?,?)");
						
		ps.setString(1, a.getEmpresaNIF());
		ps.setString(2, a.getEmpresaContrasenia());
		
		/** filas shows the amount of 
		 *  updated rows 
		 */
		int filas = ps.executeUpdate();
		
		ps.close();
	}





}
