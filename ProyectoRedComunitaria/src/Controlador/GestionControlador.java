/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Emprendedor;
import Clases.GestionInformacion;
import Modelo.GestionInformacionDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Katherin Monroy y Luis Felipe Alzate Osorio
 */
public class GestionControlador {
    private GestionInformacionDAO gestionInformacionDAO;

    public GestionControlador() {
        gestionInformacionDAO= new GestionInformacionDAO();
    }
    
    public void agregar(GestionInformacion gestionInformacion) throws SQLException {
        gestionInformacionDAO.agregar(gestionInformacion);
    }
    
    public GestionInformacion consultar(int id) throws SQLException {
        return gestionInformacionDAO.consultar(id);
    }


    public void actualizar(GestionInformacion gestionInformacion) throws SQLException {
        gestionInformacionDAO.actualizar(gestionInformacion);
    }

    public void eliminar(int id) throws SQLException {
        gestionInformacionDAO.eliminar(id);
    }

    public List<GestionInformacion> listar() throws SQLException {
        return gestionInformacionDAO.listar();
    }
    
    public List<Integer> listarProyectos() throws SQLException {
        return gestionInformacionDAO.listarProyectos();
    }
    
    public List<Integer> listarEmprendedores() throws SQLException {
        return gestionInformacionDAO.listarEmprendedores();
    }
    
}
