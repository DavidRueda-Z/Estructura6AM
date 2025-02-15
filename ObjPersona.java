package Estructura6AM;

public class ObjPersona {
    
    private String nombre;
    private String apellido;
    private String direccion;
    private long telefono; //long = entero que permite capturar mas de 7 caracteres numericos


    public ObjPersona(String nombre, String apellido, String direccion, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { //Set es para asignar un valor a la variable nombre
        this.nombre = nombre;
    }



    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public long getTelefono() {
        return telefono;
    }



    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }



    public ObjPersona() {
    }

    
    
}
