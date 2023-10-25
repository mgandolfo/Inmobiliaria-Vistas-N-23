package inmobiliaria23.entidades;

import java.time.LocalDate;

public class ContratoAlquiler {

    private int id_contrato;
    private Inquilino inquilino;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private Double MontoAlquilerPesos;
    private PropiedadInmueble idpropiedad;
    private String Detalles;//con o sin expensas/con-sin servicios/con-sin garage
    private String estado;//vigente=1, no vigente=0, Renovado=2
//constructor vacio

    public ContratoAlquiler() {
    }
//constructor completo

    public ContratoAlquiler(int id_contrato, Inquilino inquilino, LocalDate fechaInicio, LocalDate fechaFinal, Double MontoAlquilerPesos, PropiedadInmueble idpropiedad, String Detalles, String estado) {
        this.id_contrato = id_contrato;
        this.inquilino = inquilino;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.MontoAlquilerPesos = MontoAlquilerPesos;
        this.idpropiedad = idpropiedad;
        this.Detalles = Detalles;
        this.estado = estado;
    }


   //constructor sin id

    public ContratoAlquiler(Inquilino inquilino, LocalDate fechaInicio, LocalDate fechaFinal, Double MontoAlquilerPesos, PropiedadInmueble idpropiedad, String Detalles, String estado) {
        this.inquilino = inquilino;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.MontoAlquilerPesos = MontoAlquilerPesos;
        this.idpropiedad = idpropiedad;
        this.Detalles = Detalles;
        this.estado = estado;
    }

    public int getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Double getMontoAlquilerPesos() {
        return MontoAlquilerPesos;
    }

    public void setMontoAlquilerPesos(Double MontoAlquilerPesos) {
        this.MontoAlquilerPesos = MontoAlquilerPesos;
    }

    public PropiedadInmueble getIdpropiedad() {
        return idpropiedad;
    }

    public void setIdpropiedad(PropiedadInmueble idpropiedad) {
        this.idpropiedad = idpropiedad;
    }

    public String getDetalles() {
        return Detalles;
    }

    public void setDetalles(String Detalles) {
        this.Detalles = Detalles;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ContratoAlquiler{" + "id_contrato=" + id_contrato + ", inquilino=" + inquilino + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", MontoAlquilerPesos=" + MontoAlquilerPesos + ", idpropiedad=" + idpropiedad + ", Detalles=" + Detalles + ", estado=" + estado + '}';
    }

    
    
    }
