
package colecciones4;

import java.util.Scanner;





public class Pelicula {
    
    private String nombre;
    private String director;
    private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String nombre, String director, int duracion) {
        this.nombre = nombre;
        this.director = director;
        this.duracion = duracion;
    }
    public void crearPelicula(){
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una pelicula:");
            setNombre(leer.nextLine());
            System.out.println("Ingrese el nombre del director:");
            setDirector(leer.nextLine());
            System.out.println("Ingrese duracion de la pelicula:");
            setDuracion(leer.nextInt());
            leer.nextLine();
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula: " + " Titulo: " + nombre + " Director: " + director + " Duracion: " + duracion ;
    }

    
    

   
    
}
