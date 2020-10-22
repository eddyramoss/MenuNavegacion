package com.example.prueba_11.Entidades;

public class Persona {

    private String nombre;
    private String fechaElavoracion;
    private int imagenid;

    public void persona(){

    }
    public Persona(String nombre, String fechaElavoracion, int imagenid) {
        this.nombre = nombre;
        this.fechaElavoracion = fechaElavoracion;
        this.imagenid = imagenid;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public String getFechaElavoracion() {
        return fechaElavoracion;
    }
    public void setFechaElavoracion(String fechaElavoracion){
        this.fechaElavoracion= fechaElavoracion;
    }

    public int getImagenid() {
        return imagenid;
    }
    public void setImagenid(int Imagenid){
        this.imagenid =imagenid;
    }
}
