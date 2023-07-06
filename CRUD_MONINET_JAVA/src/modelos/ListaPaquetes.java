/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class ListaPaquetes {

    ArrayList<Paquete> listaPaquetes;

    public ListaPaquetes() {
        listaPaquetes = new ArrayList<>();
    }

    public ArrayList<Paquete> getListaPaquetes() {
        return listaPaquetes;
    }

    public void setListaPaquetes(ArrayList<Paquete> listaPaquetes) {
        this.listaPaquetes = listaPaquetes;
    }

}
