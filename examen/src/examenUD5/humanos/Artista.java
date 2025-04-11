package humanos;


/**
 * @author Diego Ferreiros
 */
public class Artista extends Persona{
    /**
     *
     * @param nombre Nombre del artista
     * @param dni DNI del artista
     * @param edad Edad del artista
     */
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
