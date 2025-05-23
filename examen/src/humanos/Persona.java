package src.humanos;


/**
 * @author Diego Ferreiros
 */
public class Persona {
    private String nombre;
    private String dni;
    private int edad;
    /**
     *
     * @param nombre Nombre de la persona
     * @param dni DNI de la persona
     * @param edad Edad de la persona
     */
    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad;
    }

    public void mostrarInformacion() {
        System.out.println(this.toString());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
