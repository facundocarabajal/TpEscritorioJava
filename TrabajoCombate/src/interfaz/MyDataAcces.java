package interfaz;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import resources.AsignacionPersonajes; CUANDO LA TRAIGA DE OTRO PACK//

public class MyDataAcces
{

	private String _usuario="root";
	private String _pwd= "root";
	private static String _bd="emrpesa";
	static String _url = "jdbc:mysql://localhost/"+_bd;
	 Connection conn = null;
	
	public MyDataAcces() {
	
		
		try{
			Class.forName("com.mysql.jdbc.Connection");
			conn = (Connection)DriverManager.getConnection(_url, _usuario, _pwd);
			if(conn != null)
			{
				System.out.println("Conexion a base de datos "+_url+" . . . Ok");
			};
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO persona VALUES (?,?,?,?,?)");
			       
			
		//	AsignacionPersonajes.main(null);
			
			
		
		      String nombre ="juan";
				
				stmt.setString(1,nombre);
				stmt.setString(2,null);
				stmt.setString(3,null);
				stmt.setString(4,null);
				stmt.setString(5,null);
			/*	stmt.setInt(2,AsignacionPersonajes.getEnergia());
			//	stmt.setInt(3,AsignacionPersonajes.getVida());
				stmt.setInt(4,AsignacionPersonajes.getDefensa());
				stmt.setInt(5,AsignacionPersonajes.getEvasion());
			//	stmt.setInt(6,AsignacionPersonajes.getPuntos);*/
				int retorno = stmt.executeUpdate();      
				 if (retorno>0)
				 {
			           System.out.println("Insertado correctamente");
				 }
		}
		catch(SQLException ex)
		{
			System.out.println("Hubo un problema al intentar conectarse a la base de datos"+_url);
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println(ex);
		}		
	}
	
	public ResultSet getQuery(String _query)
	{
		Statement state = null;
		ResultSet resultado = null;
		
		try{
			state = (Statement) conn.createStatement();
			resultado = state.executeQuery(_query);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		
		}
		return resultado;
	}
	
	public void setQuery(String _query){

		Statement state = null;
		
		try{			
			state=(Statement) conn.createStatement();
			state.execute(_query);

         } catch (SQLException e){
            e.printStackTrace();
       }
	}
}
