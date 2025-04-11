package recursos;

import SistemaBiblioteca.Humanos.Autor;
import SistemaBiblioteca.Prestable;

public class Libro extends RecursoBibliografico implements Prestable {
    protected Autor autor;

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
    public void prestar() {
        if (disponible) {
            System.out.println("El libro ha sido prestado con éxito");
            setDisponible(false);
        } else {
            throw new IllegalArgumentException("Error: El libro no está disponible, no ha sido prestado");
        }
    }

    @Override
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
