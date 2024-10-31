/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Clases.Emprendedor;
import Clases.Pais;
import Modelo.EmprendedorDAO;
import Modelo.PaisDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author FELIPE
 */
public class PaisControlador {
    private PaisDAO paisDAO;

    public PaisControlador() {
        paisDAO = new PaisDAO();
    }

    public void agregar(Pais pais) throws SQLException {
        paisDAO.agregar(pais);
    }
    
    public Pais consultar(int id) throws SQLException {
        return paisDAO.consultar(id);
    }


    public void actualizar(Pais pais) throws SQLException {
        paisDAO.actualizar(pais);
    }

    public void eliminar(int id) throws SQLException {
        paisDAO.eliminar(id);
    }

    public List<Pais> listar() throws SQLException {
        return paisDAO.listar();
    }
}
