package SistemaBiblioteca.Humanos;

public class Artista extends Persona{


    public Artista(String nombre, String dni, int edad) {
        super(nombre, dni, edad);
    }

    public Artista() {
    }

    @Override
    public String toString() {
        return "Artista{ " + super.toString() + " }";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(this.toString());
    }
}
