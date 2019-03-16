package ejercicio_3_biblioteca;

public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private String nacionalidad;

    public Persona() {
        this.dni = "";
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.nacionalidad = "";
    }

    public Persona(String dni, String nombre, String apellidos, int edad, String nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean equals(Persona p) {
        return (this.nombre.equals(p.nombre) && this.apellidos.equals(p.apellidos)
                && this.dni.equals(p.dni) && this.edad == p.edad
                && this.nacionalidad.equals(p.nacionalidad));
    }

    public String toString() {
        return "Dni: " + this.dni + "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos
                + "\nEdad: " + this.edad + "\nNacionalidad: " + this.nacionalidad;
    }

}
