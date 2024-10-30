
package Modelo;

import Util.ConexionBD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Katherin
 */
public class UsuarioDAO {
    
    private Connection connection; 
    
    ////////////////////////////////

    public UsuarioDAO() {
        connection = ConexionBD.getConnection();
    }
    
    
    
}
