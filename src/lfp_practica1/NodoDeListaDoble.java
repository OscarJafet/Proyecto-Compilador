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
public class NodoDeListaDoble {
 NodoDeListaDoble Eanterior;
 NodoDeListaDoble Siguiente;
  String Dato;
  String token;

    public NodoDeListaDoble(NodoDeListaDoble Eanterior, NodoDeListaDoble Siguiente, String Dato,String token) {
        this.Eanterior = Eanterior;
        this.Siguiente = Siguiente;
        this.Dato = Dato;
        this.token=token;
    }

    public NodoDeListaDoble(String Dato,String token) {
        this.Dato = Dato;
        this.token=token;
        this.Eanterior=null;
        this.Siguiente=null;
    }

     
    public NodoDeListaDoble getEanterior() {
        return Eanterior;
    }

    public void setEanterior(NodoDeListaDoble Eanterior) {
        this.Eanterior = Eanterior;
    }

    public NodoDeListaDoble getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(NodoDeListaDoble Siguiente) {
        this.Siguiente = Siguiente;
    }

    public String getDato() {
        return Dato;
    }
public String getToken() {
        return token;
    }
  
  
}
