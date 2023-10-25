package inmobiliaria23.entidades;

public class Propietario {

    private int id_propietario;
    private String apellido;
    private String nombre;
    private int dni;
    private int tel;
    private String domicilio;
    private boolean estado;

    //private ArrayList<PropiedadInmueble> localesPropios;
//constructor vacio
    public Propietario() {
    }
//conntructor completo

    public Propietario(int id_propietario, String apellido, String nombre, int dni, int tel, String domicilio, boolean estado) {
        this.id_propietario = id_propietario;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.tel = tel;
        this.domicilio = domicilio;
        this.estado = estado;
    }

//constructor sin id
    public Propietario(int id_propietario) {
        this.id_propietario = id_propietario;

    }

    public Propietario(String apellido, String nombre, int dni, int tel, String domicilio, boolean estado) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.tel = tel;
        this.domicilio = domicilio;
        this.estado = estado;
    }

    public int getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(int id_propietario) {
        this.id_propietario = id_propietario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Propietario{" + "id_propietario=" + id_propietario + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + ", tel=" + tel + ", domicilio=" + domicilio + ", estado=" + estado + '}';
    }

}
