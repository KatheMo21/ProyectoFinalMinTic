
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
    // objeto conncection
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_red_comunitaria", "root", "");
                System.out.println("Conexion exitosa");
            } catch (SQLException e) {
                System.out.println("Error en Conexion");
                e.printStackTrace();
            }
        }
        return connection;
    

    }
}
