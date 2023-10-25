package inmobiliaria23.entidades;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Inquilino {

    private int id_inquilino;
    private String apellido;
    private String nombre;
    private int dni;
    private String CUIL;
    private int tel;
    private String lugarDetrabajo;
    private String Garante;
    private boolean estado;

//    private char tipo;//??
//    private ArrayList<PropiedadInmueble> Propiedad;//(tipo de local, zona,  y precio aproximado)
//    private char Detalle;//documentacion presentada
//    private Garantia garantia;
//constructor vacio
    public Inquilino() {
    }
//constructor completo

    public Inquilino(int id_inquilino, String apellido, String nombre, int dni, String CUIL, int tel, String lugarDetrabajo, String Garante, boolean estado) {
        this.id_inquilino = id_inquilino;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.CUIL = CUIL;
        this.tel = tel;
        this.lugarDetrabajo = lugarDetrabajo;
        this.Garante = Garante;
        this.estado = estado;
    }

    //constructor sin id
    public Inquilino(String apellido, String nombre, int dni, String CUIL, int tel, String lugarDetrabajo, String Garante, boolean estado) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.CUIL = CUIL;
        this.tel = tel;
        this.lugarDetrabajo = lugarDetrabajo;
        this.Garante = Garante;
        this.estado = estado;
    }

    public int getId_inquilino() {
        return id_inquilino;
    }

    public void setId_inquilino(int id_inquilino) {
        this.id_inquilino = id_inquilino;
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

    public String getCUIL() {
        return CUIL;
    }

    public void setCUIL(String CUIL) {
        this.CUIL = CUIL;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getLugarDetrabajo() {
        return lugarDetrabajo;
    }

    public void setLugarDetrabajo(String lugarDetrabajo) {
        this.lugarDetrabajo = lugarDetrabajo;
    }

    public String getGarante() {
        return Garante;
    }

    public void setGarante(String Garante) {
        this.Garante = Garante;
    }

   

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Inquilino{" + "apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + ", CUIL=" + CUIL + ", tel=" + tel + ", lugarDetrabajo=" + lugarDetrabajo + ", Garante=" + Garante +  ", estado=" + estado + '}';
    }

}


