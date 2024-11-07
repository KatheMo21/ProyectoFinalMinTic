
package Modelo;

import Clases.Usuario;
import Util.ConexionBD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Katherin Monroy y Luis Felipe Alzate Osorio
 */
public class UsuarioDAO {
    
    private Connection connection; 
    
    ////////////////////////////////

    public UsuarioDAO() {
        connection = ConexionBD.getConnection();
    }
    
    public void agregar(Usuario usuario) throws SQLException {
        String query = "INSERT INTO usuario (nombre_usuario,contrasenia) VALUES (?, ?)";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, usuario.getNombre_usuario());
        ps.setString(2, usuario.getContrasenia());
        ps.executeUpdate();
        ps.close();
    }
    
    public Usuario consultar(int idBuscar) throws SQLException {
        String query = "SELECT * FROM usuario WHERE id_usuario = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, idBuscar);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            int id = resultSet.getInt("id_usuario");
            String nombre_usuario = resultSet.getString("nombre_usuario");
            String contrasenia = resultSet.getString("contrasenia");
            Usuario usuario = new Usuario(id, nombre_usuario, contrasenia);
            return usuario;
        }   
        statement.close();      
        return null;
    }
    
    public void actualizar(Usuario usuario) throws SQLException {
        String query = "UPDATE usuario SET nombre_usuario = ?, contrasenia = ? WHERE id_usuario = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, usuario.getNombre_usuario());
        ps.setString(2, usuario.getContrasenia());
        ps.setInt(3, usuario.getId_usuario());
        ps.executeUpdate();
        ps.close();
    }

    public void eliminar(int id) throws SQLException {
        String query = "DELETE FROM usuario WHERE id_usuario = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
    }
    
    public List<Usuario> listar() throws SQLException {
        List<Usuario> lista = new ArrayList<>();
        String query = "SELECT * FROM usuario";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            Usuario usuario = new Usuario();
            usuario.setId_usuario(rs.getInt("id_usuario"));
            usuario.setNombre_usuario(rs.getString("nombre_usuario"));
            usuario.setContrasenia(rs.getString("contrasenia"));
            lista.add(usuario);
        }
        rs.close();
        st.close();
        return lista;
    }
    
    
}
