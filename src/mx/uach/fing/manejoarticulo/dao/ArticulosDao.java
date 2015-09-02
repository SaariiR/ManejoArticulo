package mx.uach.fing.manejoarticulo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.uach.fing.manejoarticulo.datos.Articulo;
/**
 *
 * @author Sara Rodriguez Soto
 */
public class ArticulosDao implements Crud{
    
    @Override
    
    public List<Articulo> list() {
        List<Articulo> articulos = new ArrayList<>();
        try {
            Statement statement = Conexion.getInstance().getConnection().createStatement();
            String sql = String.format("SELECT %s FR0M %s", Articulo.fieldsToString(), Articulo.TABLA);
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt(Articulo.FIELDS[0]);
                String descripcion = resultSet.getString(Articulo.FIELDS[1]);
                int precio  = resultSet.getInt(Articulo.FIELDS[2]);
                String clasificacion= resultSet.getString(Articulo.FIELDS[3]);
                int eximin  = resultSet.getInt(Articulo.FIELDS[4]);
                int eximax  = resultSet.getInt(Articulo.FIELDS[5]);
                Articulo articulo = new Articulo(id, descripcion, precio, 
                        clasificacion, eximin, eximax);
                articulos.add(articulo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticulosDao.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return articulos;
    }

    @Override
    public void create(Articulo articulo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Articulo articulo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Articulo articulo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
