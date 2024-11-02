/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Clases.Emprendedor;
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
public class EmprendedorDAO {
    private Connection connection;
    
    public EmprendedorDAO() {
        this.connection = ConexionBD.getConnection();
    }
    
    public void agregar(Emprendedor emprendedor) throws SQLException {
        String query = "INSERT INTO emprendedor (id_pais_nacimiento,id_usuario, nombre, apellido, edad, genero, profesion, anio_nacimiento,mes_nacimiento) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query);
        
        
        ps.setInt(1, emprendedor.getId_pais_nacimiento());
        ps.setInt(2, emprendedor.getId_usuario());
        ps.setString(3, emprendedor.getNombre());
        ps.setString(4, emprendedor.getApellido());
        ps.setString(5, emprendedor.getEdad());
        ps.setString(6, emprendedor.getGenero());
        ps.setString(7, emprendedor.getProfesion());
        ps.setString(8, emprendedor.getAnio_nacimiento());
        ps.setString(9, emprendedor.getMes_nacimiento());
        
        ps.executeUpdate();
        ps.close();
    }
    
    public Emprendedor consultar(int idBuscar) throws SQLException {
        String query = "SELECT * FROM emprendedor WHERE id_emprendedor = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, idBuscar);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            int id = resultSet.getInt("id_emprendedor");
            int id_pais_nacimiento = resultSet.getInt("id_pais_nacimiento");
            int id_usuario = resultSet.getInt("id_usuario");
            String nombre = resultSet.getString("nombre");
            String apellido = resultSet.getString("apellido");
            String edad = resultSet.getString("edad");
            String genero = resultSet.getString("genero");
            String profesion = resultSet.getString("profesion");
            String anio_nacimiento = resultSet.getString("anio_nacimiento");
            String mes_nacimiento = resultSet.getString("mes_nacimiento");
            
            Emprendedor emprendedor = new Emprendedor(id,id_pais_nacimiento,id_usuario,nombre,apellido,edad,genero,profesion,anio_nacimiento,mes_nacimiento);
            
            return emprendedor;
        }   
        statement.close();      
        return null;
    }
    
    public void actualizar(Emprendedor emprendedor) throws SQLException {
        String query = "UPDATE emprendedor SET id_pais_nacimiento=?,id_usuario=?, nombre=?, apellido=?, edad=?, genero=?, profesion=?, anio_nacimiento=?,mes_nacimiento=? WHERE id_emprendedor = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, emprendedor.getId_pais_nacimiento());
        ps.setInt(2, emprendedor.getId_usuario());
        ps.setString(3, emprendedor.getNombre());
        ps.setString(4, emprendedor.getApellido());
        ps.setString(5, emprendedor.getEdad());
        ps.setString(6, emprendedor.getGenero());
        ps.setString(7, emprendedor.getProfesion());
        ps.setString(8, emprendedor.getAnio_nacimiento());
        ps.setString(9, emprendedor.getMes_nacimiento());
        ps.executeUpdate();
        ps.close();
    }
    
    public void eliminar(int id) throws SQLException {
        String query = "DELETE FROM emprendedor WHERE id_emprendedor = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
    }
    
    public List<Emprendedor> listar() throws SQLException {
        List<Emprendedor> lista = new ArrayList<>();
        String query = "SELECT * FROM emprendedor";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            Emprendedor emprendedor = new Emprendedor();
            emprendedor.setId_emprendedor(rs.getInt("id_emprendedor"));
            emprendedor.setId_pais_nacimiento(rs.getInt("id_pais_nacimiento"));
            emprendedor.setId_usuario(rs.getInt("id_usuario"));
            emprendedor.setNombre(rs.getString("nombre"));
            emprendedor.setApellido(rs.getString("apellido"));
            emprendedor.setEdad(rs.getString("edad"));
            emprendedor.setGenero(rs.getString("genero"));
            emprendedor.setProfesion(rs.getString("profesion"));
            emprendedor.setAnio_nacimiento(rs.getString("anio_nacimiento"));
            emprendedor.setMes_nacimiento(rs.getString("mes_nacimiento"));
            
            
            
            lista.add(emprendedor);
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
}
