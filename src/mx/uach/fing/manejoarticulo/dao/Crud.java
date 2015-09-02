package mx.uach.fing.manejoarticulo.dao;

import java.util.List;
import mx.uach.fing.manejoarticulo.datos.Articulo;

/**
 *
 * @author Sara Rodriguez Soto
 */
public interface Crud {
    
    public List<Articulo> list();
    
    public void create(Articulo articulo);
    public void update(Articulo articulo);
    public void delete(Articulo articulo);
}
