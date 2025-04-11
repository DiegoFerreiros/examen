package recursos;

import SistemaBiblioteca.Humanos.Autor;
import SistemaBiblioteca.Prestable;


/**
 * @author Diego Ferreiros
 */
public class Libro extends RecursoBibliografico implements Prestable {
    protected Autor autor;

    /**
     *
     * @param titulo Titulo del libro
     * @param anoPublicacion Año de publicacion del libro
     * @param disponible Si está o no disponible en la tienda
     * @param autor Autor del libro
     */
    public Libro(String titulo, int anoPublicacion, boolean disponible, Autor autor) {
        super(titulo, anoPublicacion, disponible);
        this.autor = autor;
    }

    public Libro() {
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor=" + autor +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", disponible=" + disponible +
                '}';
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(this.toString());
    }

    @Override
    /**
     * @throws IllegalArgumentException Si intentas prestar un libro que no está en la tienda
     */
    public void prestar() {
        if (disponible) {
            System.out.println("El libro ha sido prestado con éxito");
            setDisponible(false);
        } else {
            throw new IllegalArgumentException("Error: El libro no está disponible, no ha sido prestado");
        }
    }

    @Override
    /**
     * @throws IllegalArgumentException Si intentas devolver un libro que ya está en la tienda
     */
    public void devolver() {
        if (!disponible) {
            System.out.println("El libro ha sido devuelto con éxito");
            setDisponible(true);
        } else {
            throw new IllegalArgumentException("Error: El libro ya estaba disponible, no habia sido prestado");
        }
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
