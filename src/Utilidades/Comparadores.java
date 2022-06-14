
package Utilidades;

import colecciones4.Pelicula;
import java.util.Comparator;

public class Comparadores {
    public static Comparator<Pelicula> ordenarPorDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
          return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
   public static Comparator<Pelicula> ordenarPorDuracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
          return t.getDuracion().compareTo(t1.getDuracion());
        }
    }; 
    public static Comparator<Pelicula> ordenardIRECTOR = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
          return t.getDirector().compareTo(t1.getDirector());
        }
    };
     public static Comparator<Pelicula> ordenarTITULO = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
          return t.getNombre().compareTo(t1.getNombre());
        }
    };
    
            
            
            
}
