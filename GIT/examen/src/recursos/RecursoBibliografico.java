package recursos;

public abstract class RecursoBibliografico {
    protected String titulo;
    protected int anoPublicacion;
    protected boolean disponible;

    protected RecursoBibliografico(String titulo, int anoPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
        this.disponible = disponible;
    }

    protected RecursoBibliografico() {
    }


    public abstract void mostrarInformacion();


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
