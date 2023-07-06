/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author usuario
 */
public class Paquete {

    private String idPaquete;
    private String nombre;
    private String velocidad;
    private String precio_mensual;

    public Paquete() {
    }

    public String getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(String idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getPrecio_mensual() {
        return precio_mensual;
    }

    public void setPrecio_mensual(String precio_mensual) {
        this.precio_mensual = precio_mensual;
    }

}
