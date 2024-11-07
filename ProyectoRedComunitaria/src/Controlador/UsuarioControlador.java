/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Proyecto;
import Clases.Usuario;
import Modelo.ProyectoDAO;
import Modelo.UsuarioDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Katherin Monroy y Luis Felipe Alzate Osorio
 */
public class UsuarioControlador {
    private UsuarioDAO usuarioDAO;

    public UsuarioControlador() {
        usuarioDAO = new UsuarioDAO();
    }

    public void agregar(Usuario usuario) throws SQLException {
        usuarioDAO.agregar(usuario);
    }
    
    public Usuario consultar(int id) throws SQLException {
        return usuarioDAO.consultar(id);
    }


    public void actualizar(Usuario usuario) throws SQLException {
        usuarioDAO.actualizar(usuario);
    }

    public void eliminar(int id) throws SQLException {
        usuarioDAO.eliminar(id);
    }

    public List<Usuario> listar() throws SQLException {
        return usuarioDAO.listar();
    }
}
