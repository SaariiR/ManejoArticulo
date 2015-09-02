
package mx.uach.fing.manejoarticulo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sara Rodriguez Soto
 */
public class Conexion {
     private static Conexion conexion;
    private Connection connection;
    
    private Conexion() {
    }
    
    public Connection getConnection() {
        if (null == this.connection) {
            String driver = "org.postgresql.Driver";
            String cadenaConexion = "jdbc:postgresql://localhost:54322/articulos";
            String articulos = "articulos";
            String password = "";
            try {
                Class.forName(driver);
                this.connection = DriverManager
                        .getConnection(cadenaConexion, articulos, password);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Conexion.class.getName())
                        .log(Level.SEVERE, null, ex);
                // TODO: Atender recuperacion a ratitos.
            }
        }
        return this.connection;
    }
    
    public static Conexion getInstance() {
        if (null == Conexion.conexion) {
            Conexion.conexion = new Conexion();
        }
        return Conexion.conexion;
    }
}
