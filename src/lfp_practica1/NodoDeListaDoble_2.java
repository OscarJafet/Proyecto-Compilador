/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lfp_practica1;

/**
 *
 * @author jes
 */
public class NodoDeListaDoble_2 {
 NodoDeListaDoble_2 Eanterior;
 NodoDeListaDoble_2 Siguiente;
  String Dato;


    public NodoDeListaDoble_2(NodoDeListaDoble_2 Eanterior, NodoDeListaDoble_2 Siguiente, String Dato) {
        this.Eanterior = Eanterior;
        this.Siguiente = Siguiente;
        this.Dato = Dato;
   
    }

    public NodoDeListaDoble_2(String Dato) {
        this.Dato = Dato;
     
        this.Eanterior=null;
        this.Siguiente=null;
    }

     
    public NodoDeListaDoble_2 getEanterior() {
        return Eanterior;
    }

    public void setEanterior(NodoDeListaDoble_2 Eanterior) {
        this.Eanterior = Eanterior;
    }

    public NodoDeListaDoble_2 getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(NodoDeListaDoble_2 Siguiente) {
        this.Siguiente = Siguiente;
    }

    public String getDato() {
        return Dato;
    }

  
}
