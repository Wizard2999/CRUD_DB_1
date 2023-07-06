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
public class ListaContratos {

    private ArrayList<Contratos> listaContratos;

    public ListaContratos() {
        listaContratos = new ArrayList<>();
    }

    public ArrayList<Contratos> getListaContratos() {
        return listaContratos;
    }

    public void setListaContratos(ArrayList<Contratos> listaContratos) {
        this.listaContratos = listaContratos;
    }

}
