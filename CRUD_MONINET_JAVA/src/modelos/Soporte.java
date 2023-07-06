/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author usuario
 */
public class Soporte {

    private String idTicket;
    private String IdContrato;

    public Soporte(String idTicket, String IdContrato) {
        this.idTicket = idTicket;
        this.IdContrato = IdContrato;
    }

    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
    }

    public String getIdContrato() {
        return IdContrato;
    }

    public void setIdContrato(String IdContrato) {
        this.IdContrato = IdContrato;
    }

}
