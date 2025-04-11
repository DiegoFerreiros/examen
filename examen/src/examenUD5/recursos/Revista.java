package recursos;

import SistemaBiblioteca.Prestable;

/**
 * @author Diego Ferreiros
 */
public class Revista extends RecursoBibliografico implements Prestable {
    private int numero;

    /**
     *
     * @param titulo Título de la revista
     * @param anoPublicacion Año de publicación de la revista
     * @param disponible Si está o no disponible
     * @param numero Número de la revista
     */
    public Revista(String titulo, int anoPublicacion, boolean disponible, int numero) {
        super(titulo, anoPublicacion, disponible);
        this.numero = numero;
    }

    public Revista() {
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numero=" + numero +
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
     * @throws IllegalArgumentException Si intentas prestar una revista que no está en la tienda
     */
    public void prestar() {
        if (disponible) {
            System.out.println("La revista ha sido prestada con éxito");
            setDisponible(false);
        } else {
            throw new IllegalArgumentException("Error: La revista no está disponible, no ha sido prestada");
        }
    }

    @Override
    /**
     * @throws IllegalArgumentException Si intentas devolver una revista que ya está en la tienda
     */
    public void devolver() {
        if (!disponible) {
            System.out.println("La revista ha sido devuelta con éxito");
            setDisponible(true);
        } else {
            throw new IllegalArgumentException("Error: La revista ya estaba disponible, no habia sido prestada");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
