///Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
//esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
//horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
//cuenta lo que se pide a continuación:
//En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
//usuario todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
//quiere crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las elículas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
//en pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
//en pantalla.
//• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
package colecciones4;

import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Colecciones4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rta;
        ArrayList<Pelicula> peliculas = new ArrayList();
        do {
            Pelicula a1 = new Pelicula();
            a1.crearPelicula();
            peliculas.add(a1);
            System.out.println("Desea agregar otra pelicula?");
        do {
           rta = leer.nextLine();
           if (!((rta.equalsIgnoreCase("no"))||(rta.equalsIgnoreCase("si")))){
               System.out.println("ERROR: INGRESE UNA RESPUESTA VALIDA");
           }
        }while (!((rta.equalsIgnoreCase("no"))||(rta.equalsIgnoreCase("si"))));
        } while (rta.equalsIgnoreCase("si"));
         System.out.println("LISTA DE PELICULAS");
         peliculas.forEach((a1) -> {
             System.out.println(a1);
        });
        System.out.println("----------------------------------------------");
        Iterator<Pelicula> it = peliculas.iterator();
        System.out.println("LISTA DE PELICULAS MAYORES A UNA HORA:");
        while (it.hasNext()) {
            Pelicula a1 = it.next();
            if (a1.getDuracion() > 60) {
                System.out.println(a1);
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("PELICULAS ORDENADAS POR DURACION MAYOR A MENOR:");
        Collections.sort(peliculas, Comparadores.ordenarPorDuracion);
        peliculas.forEach((Pelicula) -> {
            System.out.println(Pelicula);
        });
        System.out.println("-------------------------------------------");
        System.out.println("PELICULAS ORDENADAS POR DURACION MENOR A MAYOR:");
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionAscendente);
        peliculas.forEach((Pelicula) -> {
            System.out.println(Pelicula);
        });
      System.out.println("-------------------------------------------");
        System.out.println("PELICULAS ORDENADAS POR DIRECTOR ALFABETICAMENTE:");
        Collections.sort(peliculas, Comparadores.ordenardIRECTOR);
        peliculas.forEach((Pelicula) -> {
            System.out.println(Pelicula);
        });
        System.out.println("-------------------------------------------");
        System.out.println("PELICULAS ORDENADAS POR TITULO ALFABETICAMENTE:");
        Collections.sort(peliculas, Comparadores.ordenarTITULO);
        peliculas.forEach((Pelicula) -> {
            System.out.println(Pelicula);
        });
    }
}
