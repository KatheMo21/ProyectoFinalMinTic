/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.Pais;
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
 * @author Katherin
 */
public class ProyectoDAO {
    private Connection connection;
    
    public ProyectoDAO() {
        this.connection = ConexionBD.getConnection();
    }
    
    public void agregar(Proyecto proyecto) throws SQLException {
        String query = "INSERT INTO proyecto (id_emprendedor,id_pais_creacion,nombre,sector_industrial,avaluo_proyecto) VALUES (?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query);
        
        ps.setInt(1, proyecto.getId_emprendedor());
        ps.setInt(2, proyecto.getId_pais_creacion());
        ps.setString(3, proyecto.getNombre());
        ps.setString(4, proyecto.getSector_industrial());
        ps.setDouble(5, proyecto.getAvaluo_proyecto());
        ps.executeUpdate();
        ps.close();
    }
    
    public Proyecto consultar(int idBuscar) throws SQLException {
        String query = "SELECT * FROM proyecto WHERE id_proyecto = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, idBuscar);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            int id = resultSet.getInt("id_proyecto");
            int id_emprendedor = resultSet.getInt("id_emprendedor");
            int id_pais_creacion = resultSet.getInt("id_pais_creacion");
            String nombre = resultSet.getString("nombre");
            String sector_industrial = resultSet.getString("sector_industrial");
            Double avaluo_proyecto = resultSet.getDouble("avaluo_proyecto");
            Proyecto proyecto = new Proyecto(id,id_emprendedor,id_pais_creacion,nombre,sector_industrial,avaluo_proyecto);
            return proyecto;
        }   
        statement.close();      
        return null;
    }
    
    public void actualizar(Proyecto proyecto) throws SQLException {
        String query = "UPDATE proyecto SET id_emprendedor=?,id_pais_creacion=?,nombre=?,sector_industrial=?,avaluo_proyecto=? WHERE id_proyecto = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, proyecto.getId_emprendedor());
        ps.setInt(2, proyecto.getId_pais_creacion());
        ps.setString(3, proyecto.getNombre());
        ps.setString(4, proyecto.getSector_industrial());
        ps.setDouble(5, proyecto.getAvaluo_proyecto());
        ps.setInt(6, proyecto.getId_proyecto());
        ps.executeUpdate();
        ps.close();
    }
    
    public void eliminar(int id) throws SQLException {
        String query = "DELETE FROM proyecto WHERE id_proyecto = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
    }
    
    public List<Proyecto> listar() throws SQLException {
        List<Proyecto> lista = new ArrayList<>();
        String query = "SELECT * FROM proyecto";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            Proyecto proyecto = new Proyecto();
            proyecto.setId_proyecto(rs.getInt("id_proyecto"));
            proyecto.setId_emprendedor(rs.getInt("id_emprendedor"));
            proyecto.setId_pais_creacion(rs.getInt("id_pais_creacion"));
            proyecto.setNombre(rs.getString("nombre"));
            proyecto.setSector_industrial(rs.getString("sector_industrial"));
            proyecto.setAvaluo_proyecto(rs.getDouble("avaluo_proyecto"));
            
            
            lista.add(proyecto);
        }
        rs.close();
        st.close();
        return lista;
    }
    
    public List<Integer> listarPaises() throws SQLException {
        List<Integer> listaIdPaises = new ArrayList<>();
        String query = "SELECT id_pais FROM pais";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            
            listaIdPaises.add(rs.getInt("id_pais"));
        }
        rs.close();
        st.close();
        return listaIdPaises;
    }
    
    public List<Integer> listarEmprendedores() throws SQLException {
        List<Integer> listaIdUsuario = new ArrayList<>();
        String query = "SELECT id_emprendedor FROM emprendedor";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            
            listaIdUsuario.add(rs.getInt("id_emprendedor"));
        }
        rs.close();
        st.close();
        return listaIdUsuario;
    }
}
