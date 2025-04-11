package humanos;


/**
 * @author Diego Ferreiros
 */
public class Autor extends Persona{
    /**
     *
     * @param nombre Nombre del autor
     * @param dni DNI del autor
     * @param edad Edad del autor
     */
    public Autor(String nombre, String dni, int edad) {
        super(nombre, dni, edad);
    }

    public Autor() {
    }

    @Override
    public String toString() {
        return "Autor{ " + super.toString() + " }";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(this.toString());
    }
}
