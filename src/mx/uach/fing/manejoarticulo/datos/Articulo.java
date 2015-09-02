package mx.uach.fing.manejoarticulo.datos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import mx.uach.fing.manejoarticulo.dao.ArticulosDao;

/**
 *
 * @author Sara Rodriguez Soto
 */
public class Articulo {
    
    public static final String TABLA = "articulos";
    public static final String[] FIELDS = {"id", "descripcion", "precio",
                  "clasificacion", "existencia minima", "existencia maxima"};

    private final Integer id;
    private final String descripcion;
    private final Integer precio;
    private final String clasificacion;
    private final Integer eximin;
    private final Integer eximax;

    public Articulo(Integer id, String descripcion, Integer precio, 
             String clasificacion, Integer eximin,Integer eximax) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.clasificacion = clasificacion;
        this.eximin =  eximin;
        this.eximax = eximax;
}
}