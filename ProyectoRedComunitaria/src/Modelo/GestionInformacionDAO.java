/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.GestionInformacion;
import Clases.Proyecto;
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
 * @author FELIPE
 */
public class GestionInformacionDAO {
    private Connection connection;

    public GestionInformacionDAO() {
        this.connection = ConexionBD.getConnection();
    }
    
    public void agregar(GestionInformacion gi) throws SQLException {
        String query = "INSERT INTO gestiondeinformacion (id_proyecto,fecha_generacion,id_emprendedor) VALUES (?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query);
        
        ps.setInt(1, gi.getId_proyecto());
        ps.setString(2, gi.getFechaGeneracion());
        ps.setInt(3, gi.getId_emprendedor());
        ps.executeUpdate();
        ps.close();
    }
    
    public GestionInformacion consultar(int idBuscar) throws SQLException {
        String query = "SELECT * FROM gestiondeinformacion WHERE id_gestion = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, idBuscar);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            int id = resultSet.getInt("id_gestion");
            int id_proyecto = resultSet.getInt("id_proyecto");
            String fecha = resultSet.getString("fecha_generacion");
            int id_emprendedor = resultSet.getInt("id_emprendedor");
            
            GestionInformacion gi = new GestionInformacion(id,id_proyecto,fecha,id_emprendedor);
            return gi;
        }   
        statement.close();      
        return null;
    }
    
    public void actualizar(GestionInformacion gi) throws SQLException {
        String query = "UPDATE gestiondeinformacion SET id_proyecto=?,fecha_generacion=?,id_emprendedor=? WHERE id_gestion = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, gi.getId_gestion());
        ps.setInt(2, gi.getId_proyecto());
        ps.setString(3, gi.getFechaGeneracion());
        ps.setInt(4, gi.getId_emprendedor());
        ps.setInt(5, gi.getId_gestion());
        ps.executeUpdate();
        ps.close();
    }
    
    public void eliminar(int id) throws SQLException {
        String query = "DELETE FROM gestiondeinformacion WHERE id_gestion = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
    }
    
    public List<GestionInformacion> listar() throws SQLException {
        List<GestionInformacion> lista = new ArrayList<>();
        String query = "SELECT * FROM gestiondeinformacion";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            GestionInformacion gi = new GestionInformacion();
            gi.setId_gestion(rs.getInt("id_gestion"));
            gi.setId_proyecto(rs.getInt("id_proyecto"));
            gi.setFechaGeneracion(rs.getString("fecha_generacion"));
            gi.setId_emprendedor(rs.getInt("id_emprendedor"));
          
            
            lista.add(gi);
        }
        rs.close();
        st.close();
        return lista;
    }
    
    public List<Integer> listarProyectos() throws SQLException {
        List<Integer> listaIdProyectos = new ArrayList<>();
        String query = "SELECT id_proyecto FROM proyecto";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            
            listaIdProyectos.add(rs.getInt("id_proyecto"));
        }
        rs.close();
        st.close();
        return listaIdProyectos;
    }
    
    public List<Integer> listarEmprendedores() throws SQLException {
        List<Integer> listaIdemprendedores = new ArrayList<>();
        String query = "SELECT id_emprendedor FROM emprendedor";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            
            listaIdemprendedores.add(rs.getInt("id_emprendedor"));
        }
        rs.close();
        st.close();
        return listaIdemprendedores;
    }
    
}
