package app.poderes;

public abstract class Poder {

    // es la clase Padre de la que heredan los atributOS
    // sus subclases parsetonge, metamorfosis, invisibilidad y hechizo
    // la vamos a llamar con la palabra SUPER.()

    private String nombre;
    private String descripcion;

    // Agrego constructor de 2 parametros
   
    protected Poder(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;

    }

}
