
package inmobiliaria23.entidades;


public class PropiedadInmueble {
    private Propietario propietario;  
    private int idInmueble;
    private String tipoDeLocal;//deposito,oficina,local,departamento 1,2,3 o + ambientes
    private String zona;
    private String direccion;
    private int superficie;
    private String caracteristicas;//amueblado,sin amueblar,escalera, escalera y ascensor, rampa acceso a discap
    private String accesibilidad;//rampa acceso
    private float precioTasado;
    private boolean estado;//Disponible=1, No disponible=0
    
    
    
//    private String forma;//ver
    //private Revisor inspector;
//constructor vacio
    public PropiedadInmueble() {
    }
//constructor completo

    public PropiedadInmueble(Propietario propietario, int idInmueble, String tipoDeLocal, String zona, String direccion, int superficie, String caracteristicas, String accesibilidad, float precioTasado, boolean estado) {
        this.propietario= propietario;
        this.idInmueble = idInmueble;
        this.tipoDeLocal = tipoDeLocal;
        this.zona = zona;
        this.direccion = direccion;
        this.superficie = superficie;
        this.caracteristicas = caracteristicas;
        this.accesibilidad = accesibilidad;
        this.precioTasado = precioTasado;
        this.estado = estado;
    }

    public PropiedadInmueble(Propietario Propietario, String tipoDeLocal, String zona, String direccion, int superficie, String caracteristicas, String accesibilidad, float precioTasado, boolean estado) {
        this.propietario = propietario;
        this.tipoDeLocal = tipoDeLocal;
        this.zona = zona;
        this.direccion = direccion;
        this.superficie = superficie;
        this.caracteristicas = caracteristicas;
        this.accesibilidad = accesibilidad;
        this.precioTasado = precioTasado;
        this.estado = estado;
        
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getTipoDeLocal() {
        return tipoDeLocal;
    }

    public void setTipoDeLocal(String tipoDeLocal) {
        this.tipoDeLocal = tipoDeLocal;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(String accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public float getPrecioTasado() {
        return precioTasado;
    }

    public void setPrecioTasado(float precioTasado) {
        this.precioTasado = precioTasado;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "PropiedadInmueble{" + "propietario=" + propietario + ", idInmueble=" + idInmueble + ", tipoDeLocal=" + tipoDeLocal + ", zona=" + zona + ", direccion=" + direccion + ", superficie=" + superficie + ", caracteristicas=" + caracteristicas + ", accesibilidad=" + accesibilidad + ", precioTasado=" + precioTasado + ", estado=" + estado + '}';
    }

    
    
}   
        
    

    