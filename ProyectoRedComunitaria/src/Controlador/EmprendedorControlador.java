package Controlador;

import Clases.Emprendedor;
import Modelo.EmprendedorDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Katherin Monroy y Luis Felipe Alzate Osorio
 */
public class EmprendedorControlador {
    private EmprendedorDAO emprendedorDAO;

    public EmprendedorControlador() {
        emprendedorDAO = new EmprendedorDAO();
    }

    public void agregar(Emprendedor emprendedor) throws SQLException {
        emprendedorDAO.agregar(emprendedor);
    }
    
    public Emprendedor consultar(int id) throws SQLException {
        return emprendedorDAO.consultar(id);
    }


    public void actualizar(Emprendedor emprendedor) throws SQLException {
        emprendedorDAO.actualizar(emprendedor);
    }

    public void eliminar(int id) throws SQLException {
        emprendedorDAO.eliminar(id);
    }

    public List<Emprendedor> listar() throws SQLException {
        return emprendedorDAO.listar();
    }
    
    public List<Integer> listarPaises() throws SQLException {
        return emprendedorDAO.listarPaises();
    }
    
    public List<Integer> listarUsuarios() throws SQLException {
        return emprendedorDAO.listarUsuarios();
    }
}
