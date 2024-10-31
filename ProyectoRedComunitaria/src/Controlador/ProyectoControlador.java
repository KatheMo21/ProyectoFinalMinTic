/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Pais;
import Clases.Proyecto;
import Modelo.ProyectoDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author FELIPE
 */
public class ProyectoControlador {
    private ProyectoDAO proyectoDAO;

    public ProyectoControlador() {
        proyectoDAO = new ProyectoDAO();
    }

    public void agregar(Proyecto proyecto) throws SQLException {
        proyectoDAO.agregar(proyecto);
    }
    
    public Proyecto consultar(int id) throws SQLException {
        return proyectoDAO.consultar(id);
    }


    public void actualizar(Proyecto proyecto) throws SQLException {
        proyectoDAO.actualizar(proyecto);
    }

    public void eliminar(int id) throws SQLException {
        proyectoDAO.eliminar(id);
    }

    public List<Proyecto> listar() throws SQLException {
        return proyectoDAO.listar();
    }
}
