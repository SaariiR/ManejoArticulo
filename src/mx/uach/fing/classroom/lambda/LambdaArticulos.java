package mx.uach.fing.classroom.lambda;

import java.util.ArrayList;
import java.util.List;
import mx.uach.fing.manejoarticulo.datos.Articulo;

/**
 *
 * @author Sara Rodriguez Soto
 */
public class LambdaArticulos {

    public static void main(String[] args) {
        List<Articulo> articulos = new ArrayList<>();

        System.out.println("Print articles with for");
        for (int i = 0; i < articulos.size(); i++) {
            System.out.println(articulos.get(i));
        }
        
        System.out.println("Print articles count (price > 20) with lambda");
        long articuloCount = articulos.stream()
                .filter((articulo) -> 20 < articulo.getprecio())
                .count();
        System.out.printf("Article count: %d\n", articuloCount);
        
         System.out.println("Print articles count (price < 15) with lambda");
        long articulosCount = articulos.stream()
                .filter((articulo) -> 15 < articulo.getprecio())
                .count();
        System.out.printf("Article count: %d\n", articuloCount);
        
    }

    public static class Articulo {

        private String descripcion;
        private int precio;
        private String clasificacion;

        public Articulo(String descripcion, int precio, String clasificacion) {
            this.descripcion = descripcion;
            this.precio = precio;
            this.clasificacion = clasificacion;
        }

        public String getdescricion() {
            return descripcion;
        }

        public void setdescripcion(String descripcion) {
            this.descripcion= descripcion;
        }

        public int getprecio() {
            return precio;
        }

        public void setprecio(int precio) {
            this.precio = precio;
        }

        public String getclasificacion() {
            return clasificacion;
        }

        public void setclasificacion(String clasificacion) {
            this.clasificacion = clasificacion;
        }

        @Override
        public String toString() {
            return String.format("%s %s Tiene %d",
                    this.descripcion, this.precio, this.clasificacion);
        }

    }

}
