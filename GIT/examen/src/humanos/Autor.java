package humanos;

public class Autor extends Persona{

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
