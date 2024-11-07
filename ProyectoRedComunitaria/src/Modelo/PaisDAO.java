/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.Pais;
import Clases.Usuario;
import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Katherin Monroy y Luis Felipe Alzate Osorio
 */
public class PaisDAO {
    private Connection connection;

    public PaisDAO() {
        this.connection = ConexionBD.getConnection();
    }
    
    public void agregar(Pais pais) throws SQLException {
        String query = "INSERT INTO pais (nombre,estado,poblacion,ciudad,region,latitud,longitud,calificacion_riesgo,tasa_impuesto) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, pais.getNombre());
        ps.setString(2, pais.getEstado());
        ps.setDouble(3, pais.getPoblacion());
        ps.setString(4, pais.getCiudad());
        ps.setString(5, pais.getRegion());
        ps.setString(6, pais.getLatitud());
        ps.setString(7, pais.getLongitud());
        ps.setString(8, pais.getCalificacion_riesgo());
        ps.setDouble(9, pais.getTasa_impuesto());
        ps.executeUpdate();
        ps.close();
    }
    
    public Pais consultar(int idBuscar) throws SQLException {
        String query = "SELECT * FROM pais WHERE id_pais = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, idBuscar);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            int id = resultSet.getInt("id_pais");
            String nombre = resultSet.getString("nombre");
            String estado = resultSet.getString("estado");
            Double poblacion = resultSet.getDouble("poblacion");
            String ciudad = resultSet.getString("ciudad");
            String region = resultSet.getString("region");
            String latitud = resultSet.getString("latitud");
            String longitud = resultSet.getString("longitud");
            String calificacion_riesgo = resultSet.getString("calificacion_riesgo");
            Double tasa_impuesto = resultSet.getDouble("tasa_impuesto");
            Pais pais = new Pais(id, nombre, estado,poblacion,ciudad,region,latitud,longitud,calificacion_riesgo,tasa_impuesto);
            return pais;
        }   
        statement.close();      
        return null;
    }
    
    public void actualizar(Pais pais) throws SQLException {
        String query = "UPDATE pais SET nombre=?,estado=?,poblacion=?,ciudad=?,region=?,latitud=?,longitud=?,calificacion_riesgo=?,tasa_impuesto=? WHERE id_pais = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, pais.getNombre());
        ps.setString(2, pais.getEstado());
        ps.setDouble(3, pais.getPoblacion());
        ps.setString(4, pais.getCiudad());
        ps.setString(5, pais.getRegion());
        ps.setString(6, pais.getLatitud());
        ps.setString(7, pais.getLongitud());
        ps.setString(8, pais.getCalificacion_riesgo());
        ps.setDouble(9, pais.getTasa_impuesto());
        ps.setInt(10, pais.getId_pais());
        ps.executeUpdate();
        ps.close();
    }
    
    public void eliminar(int id) throws SQLException {
        String query = "DELETE FROM pais WHERE id_pais = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
    }
    
    public List<Pais> listar() throws SQLException {
        List<Pais> lista = new ArrayList<>();
        String query = "SELECT * FROM pais";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            Pais pais = new Pais();
            pais.setId_pais(rs.getInt("id_pais"));
            pais.setNombre(rs.getString("nombre"));
            pais.setEstado(rs.getString("estado"));
            pais.setPoblacion(rs.getDouble("poblacion"));
            pais.setCiudad(rs.getString("ciudad"));
            pais.setRegion(rs.getString("region"));
            pais.setLatitud(rs.getString("latitud"));
            pais.setLongitud(rs.getString("longitud"));
            pais.setCalificacion_riesgo(rs.getString("calificacion_riesgo"));
            pais.setTasa_impuesto(rs.getDouble("tasa_impuesto"));
            
            lista.add(pais);
        }
        rs.close();
        st.close();
        return lista;
    }
    
    
}
