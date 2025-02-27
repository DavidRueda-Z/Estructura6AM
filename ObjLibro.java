package Estructura6AM;

public class ObjLibro {

    private String titulo;
    private String autor;
    private long precio;
    
    public ObjLibro(String titulo, String  autor, long precio)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public ObjLibro() {
    }

    
}


