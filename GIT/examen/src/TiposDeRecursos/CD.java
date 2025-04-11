package SistemaBiblioteca.TiposRecursos;

import SistemaBiblioteca.Humanos.Artista;
import SistemaBiblioteca.Prestable;

public class CD extends RecursoBibliografico implements Prestable {
    protected Artista artista;

    public CD(String titulo, int anoPublicacion, boolean disponible, Artista artista) {
        super(titulo, anoPublicacion, disponible);
        this.artista = artista;
    }

    public CD() {
    }

    @Override
    public String toString() {
        return "CD{" +
                "artista=" + artista +
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
            System.out.println("El CD ha sido prestado con éxito");
            setDisponible(false);
        } else {
            throw new IllegalArgumentException("Error: El CD no está disponible, no ha sido prestado");
        }
    }

    @Override
    public void devolver() {
        if (!disponible) {
            System.out.println("El CD ha sido devuelto con éxito");
            setDisponible(true);
        } else {
            throw new IllegalArgumentException("Error: El CD ya estaba disponible, no habia sido prestado");
        }
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
